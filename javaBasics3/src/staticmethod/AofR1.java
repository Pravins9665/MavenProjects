package staticmethod;

public class AofR1 {
	double l,h;
	double area= l * h;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AofR1.rectangle();
	}
	//static with return value without argument 
	static double rectangle() {
		int x=10,y=20;
		double res = x * y;	
		System.out.println("area of rectangle is "+res);
		return res;
}
}
