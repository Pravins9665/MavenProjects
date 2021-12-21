package IF;

public class fibonacciseries {

	// 0 1 1 2 3 5 8 13 21...
	static void Fibonacci(int n) { // n defines c will stop to print upto n
		int a = 0, b = 1, c = 0; // fixed numbers a,b and to complete infinte series c dependent

		// while(c<=n)
		for (; c <= n;) { // c should be less than n
			System.out.print(" " + c);

			a = b;
			b = c;
			c = a + b;
		}
	}

	static void Fibonacci1(int n) {

		int a = 0, b = 1, c = 0 ; // i defines number of terms in series

		// while(i<=n) {
		for (int i = 0; i <= 9; i++) {
			System.out.print(" " + c);

			a = b;
			b = c;
			c = a + b;
			// ++i;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacciseries.Fibonacci(10);
		System.out.println("\n******");
		fibonacciseries.Fibonacci1(5);

	}

}
