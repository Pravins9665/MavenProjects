package nonstaticmethod;

public class maths {
	double addition(int a, int b) {
		  double addition = a+b;
	System.out.println("addition of two numbers is "+addition);
	return addition;
	}
	double multipplication(int a, int b) {
		double multiplication = a*b;
  System.out.println("multiplication of two numbers is "+multiplication);
	return multiplication;
	}
	double division(int a, int b) {
		double division = a/b;
	System.out.println("division of two numbers is "+division);
	return division;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    maths obj= new maths();
	 obj.addition(100, 5);
     obj.addition(200, 25);
     obj.multipplication(100, 5);
     obj.multipplication(200, 25);
     obj.division(100, 5);
     obj.division(200, 25);
	}

}

	

