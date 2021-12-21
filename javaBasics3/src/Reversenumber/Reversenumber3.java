package Reversenumber;

public class Reversenumber3 {

	static void Reverse(int num, int rev) {

		for (; num != 0;) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		}

		System.out.println("reverse numner is " + rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reversenumber3.Reverse(4568, 0);
	}

}
