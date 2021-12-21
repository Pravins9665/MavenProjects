package swapnumber;

public class Swapping {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("before swapping values are.." + a + " " + b);

		// logic 1 : swap number using third variable
		int t = a; // t=10
		a = b; // a=20
		b = t; // b=10
		System.out.println("after swapping values are.." + a + " " + b);
	}

}
