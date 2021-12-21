package Reversenumber;

public class Reversenumber2 {
	int num;
	int reverse;

	Reversenumber2() {
		num = 87536;
		reverse = 0;
	}

	public static void main(String[] args) {

		Reversenumber2 obj1 = new Reversenumber2();

		while (obj1.num != 0) {
			int reminder = obj1.num % 10;
			obj1.reverse = obj1.reverse * 10 + reminder;
			obj1.num = obj1.num / 10;
		}
		System.out.println("The reverse number is: " + obj1.reverse);
	}

}
