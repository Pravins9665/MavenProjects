package swapnumber;

public class Swapping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		System.out.println("before swapping values are.." + a + " " + b);

		// logic 3 : by arithmetic operation;
		// a & b values should not be 0
		a = a * b; // a=200
		b = a / b; // b=10
		a = a / b; // a=20

		System.out.println("after swapping values are.." + a + " " + b);
	}

}
