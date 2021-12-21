package other;

public class AofT {
	static double b;
	double h;
	double res;
	static public double area1() {
		AofT obj = new AofT();
		b=2;obj.h=7;
		obj.res = 0.5*b*obj.h;
		System.out.println("Area of Triangle is "+obj.res);
		return obj.res;
	}
 void area2() {
	 b= 5;h=10;
	 res = 0.5*b*h;
	System.out.println("area of triangle is "+res);
	return;
}
 static void area2(int b, int h) {
	 AofT obj3 = new AofT();
	 b=15; obj3.h= 22;
	 obj3.res = 0.5*b*obj3.h;
	System.out.println("area of triangle is "+obj3.res);
	return;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AofT.area1();
AofT obj1 = new AofT();
obj1.area2();
AofT.area2(0, 0);
	}

}
