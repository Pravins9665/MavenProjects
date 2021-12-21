package LogicBasedProgram;

public class Swapingtwonumbers {

	public static void main(String[] args) {

		int a = 10, b = 20;

		System.out.println("Before Swapping the value are: " + a + " " + b);

//		// Using third variable
//		int t = a;
//		a = b;
//		b = t;
//		System.out.println("After Swapping the value are: " + a + " " + b);

//		// Using + & - operator
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		System.out.println("After Swapping the value are: " + a + " " + b);

//		// Using * & / operator
//		a = a * b;
//		b = a / b;
//		a = a / b;
//		System.out.println("After Swapping the value are: " + a + " " + b);

		// With single statement
		b = a + b - (a = b);
		System.out.println("After Swapping the value are: " + a + " " + b);

	}

}
