package nonstaticmethod;

public class AofT {

	double b=10;
	static int h=5;
	
	  double triangle() {
		 double res= 0.5*b*h;
		System.out.println("area of triangle is "+ res);
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AofT obj = new AofT();
		obj.triangle();
		
	}

}
