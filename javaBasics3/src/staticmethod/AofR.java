package staticmethod;

public class AofR {

	int l,h;
	double area= l * h;
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		AofR.rectangle(10,20);
		AofR.rectangle(20,30);
		AofR.rectangle(30,40);
		AofR.rectangle(40,50);
	}
	// static with return value with argument
	static double rectangle(int x, int y) {
		double res = x * y;	
		System.out.println("area of triangle is "+res);
		return res;
	}

}
