package nonstaticmethod;

public class AofT1 {
	static int b=10;
	static int h=5;
	double triangle(int x, int y) {
		double res= 0.5*x*y;
		System.out.println("area of triangle is "+ res);
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AofT1 obj = new AofT1();
       obj.triangle(10, 5);
       obj.triangle(15,25);
       obj.triangle(20,35);
       obj.triangle(30,25);
       obj.triangle(40,15);
	}

}
