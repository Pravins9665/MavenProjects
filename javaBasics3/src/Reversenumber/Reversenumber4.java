package Reversenumber;

import java.util.Scanner;

public class Reversenumber4 {

	static void reverse() {
Scanner s = new Scanner(System.in);
		int num;
		int rev = 0;
		System.out.println("enter the value of num");
		num = s.nextInt();

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("reverse number is " + rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reversenumber4.reverse();
	}

}
