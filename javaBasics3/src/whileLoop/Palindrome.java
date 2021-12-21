package whileLoop;

public class Palindrome {

	static void Pal(int n) {
		int z;
		int reverse = 0;
		z = n;
		while (n != 0) {

			int reminder = n % 10;
			reverse = reverse * 10 + reminder;
			n = n / 10;
		}
		if (reverse == z) {
			System.out.println("given number is palendrome number");
		} else {
			System.out.println("given number is not palendrome number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome.Pal(1234321);
	}

}
