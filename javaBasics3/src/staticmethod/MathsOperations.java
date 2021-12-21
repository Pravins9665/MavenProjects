package staticmethod;

public class MathsOperations {
  
	static double addition(int a, int b) {
		  double addition = a+b;
	System.out.println("addition of two numbers is "+addition);
	return addition;
	}
	static double multipplication(int a, int b) {
		double multiplication = a*b;
    System.out.println("multiplication of two numbers is "+multiplication);
	return multiplication;
	}
	static double division(int a, int b) {
		double division = a/b;
	System.out.println("division of two numbers is "+division);
	return division;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MathsOperations.addition(100, 5);
       MathsOperations.addition(200, 25);
       MathsOperations.multipplication(100, 5);
       MathsOperations.multipplication(200, 25);
       MathsOperations.division(100, 5);
       MathsOperations.division(200, 25);
	}

}
