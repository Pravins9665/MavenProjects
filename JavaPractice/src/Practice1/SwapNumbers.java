package Practice1;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 4;
		int b = 8;
		// 1. swap a numbers using temporary variable
		int t;
		t = a;
		a = b;
		b = t;
		// 2. swap numbers using arithmetic operation
		b = a + b;
		a = b - a;
		b = b - a;
		// 3.swap numbers using arithmetic operation
		b = a * b;
		a = b / a;
		b = b / a;
		// 4. swap numbers by single statement
		b = a + b - (a = b);
	}
}
