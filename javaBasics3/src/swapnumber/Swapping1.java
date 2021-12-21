package swapnumber;

public class Swapping1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		System.out.println("before swapping values are.." + a + " " + b);

		// logic 2 : by arithmetic operation
		a = a + b; // a=30
		b = a - b; // b=10
		a = a - b; // a=20

		System.out.println("after swapping values are.." + a + " " + b);
	}

}
