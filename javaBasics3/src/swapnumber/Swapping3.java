
package swapnumber;

public class Swapping3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 20;
		System.out.println("before swapping values are.." + a + ", " + b);

		// logic 4 : single statement

		b = a + b - (a = b); // from bracket a=20
								// b = 10

		System.out.println("after swapping values are.." + a + ", " + b);
	}

}
