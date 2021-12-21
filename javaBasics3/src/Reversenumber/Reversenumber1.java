package Reversenumber;

public class Reversenumber1 {

	void reverse(int num) {
		int reverse = 0;
		while (num != 0) {

			int reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		System.out.println("The reverse number is: " + reverse);
	}

	/*
	 * 1234  --   4 -- 0+4 
	 * 123  --    3 -- 43
	 * 12        2     432
	 * 1         1    4321
	 */
	
	public static void main(String[] args) {
		Reversenumber1 obj = new Reversenumber1();
		obj.reverse(1234);
	}
}