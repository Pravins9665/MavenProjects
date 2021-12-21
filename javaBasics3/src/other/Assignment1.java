package other;
public class Assignment1 {
	int l,w;
	static double rectangle(int x, int y) {
		double res = x * y;	
		System.out.println("area of rectangle is "+res);
		return res;
	}
	static int a;
	 double square(int x) {
	    double res=x*x;
	    	System.out.println("area of square is "+res);
	    	return res;
	    }
	    static int b=10,h=5;
		double res= 0.5*b*h;
		 void triangle() {
			 Assignment1 obj1 = new Assignment1();
			System.out.println("area of triangle is "+ obj1.res);
			return;
		}
		 static boolean tempreture(double degreecelsius) {
				double fahrenheit = (degreecelsius * 1.8)+32;
				System.out.println(degreecelsius + " degreecelsius is equal to " + fahrenheit+ " fahrenheit");
				return true;	
			}
		 static double simpleinterest() {	
			 double principle=15000; double rate=0.12; double time=2;
		double interest= principle*rate*time;
System.out.println("Simple interest for the amount "+principle+" at the rate of "+rate+ " for "+time+" year is "+interest);
		return interest;
		}
		  void Areaofcircle(double pi, double r) {
				double result = pi*r*r;
				System.out.println("Area of circle is "+result);
				return;
			}
	public static void main(String[] args) {
		Assignment1 obj = new Assignment1();
        Assignment1.rectangle(10,20);
        obj.square(10);
        obj.triangle();
        Assignment1.tempreture(50);
        Assignment1.simpleinterest();
        obj.Areaofcircle(3.14, 10);

	}

}
