package FOR;

public class Counting {

	static void CountDigit(int num) { // number
		int i = 0; // number of digits
		while (num > 0) {
			num = num / 10;
			i = i + 1;
		}
		System.out.println("The number of digits in number is " + i);
	}

	static void CountDigit1(int num) {
		int i;
		for (i = 0; num > 0; i++) {
			num = num / 10;

		}
		System.out.println("The number of digits in number is " + i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counting.CountDigit(45678);
		Counting.CountDigit1(987654);

	}

}
