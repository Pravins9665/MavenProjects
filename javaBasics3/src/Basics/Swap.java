package Basics;

public class Swap {

	static void swaping(int a, int b, int c) {
		a = 5;
		b = 10;
		c = 15;
		int d = a + b + c;//30
		System.out.println("value of d is " + d);//30
		a = d - c - a;//10
		b = d - b - a;//10
		c = d - c - b;//5
		System.out.println("value of d is " + a);
		System.out.println("value of d is " + b);
		System.out.println("value of d is " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap.swaping(5, 10, 15);
	}

}
