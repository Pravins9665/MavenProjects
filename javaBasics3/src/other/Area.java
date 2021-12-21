package other;

public class Area {
	static void Areaofcircle(double pi, double r) {
		double result = pi*r*r;
		System.out.println("Area of circle is "+result);
		return;
	}
	public boolean Areaofsquare(int a,int b) {
		int result1 = a*b;
		System.out.println("Area of square is "+result1);
		return true;
	}
	static void Areaoftriangle(int h, int b) {
		int result2 =h*b/2;
		System.out.println("Area of circle is "+result2);
	}
	 int Areaofrectangle(int l, int w) {
		double result3 = l*w;
		System.out.println("Area of rectangle is "+result3);
		return 100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Area obj = new Area();
        Area.Areaofcircle(3.14, 2.5);
        obj.Areaofsquare(2,2);
        Area.Areaoftriangle(5, 10);
        obj.Areaofrectangle(10, 25);
	}

}
