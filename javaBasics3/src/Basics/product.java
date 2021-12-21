package Basics;

public class product {
	double multiple() {
		float a=2.45f,b=8.951f;
		double res = a*b;
		return res;
	}

	public static void main(String[] args) {
		product obj = new product();
System.out.println("product of two float number is : "+obj.multiple() );
	}

}
