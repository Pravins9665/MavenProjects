
public class PyramidPatterns {

	static void Pattern1(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void Pattern2(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}

	static void Pattern3(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}

	static void Pattern4(int n) {
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(" " + (i + j));
			}
			System.out.println();
		}
	}
	static void Pattern5(int n) {
		int i, j, k = 1;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PyramidPatterns.Pattern1(5);
		System.out.println("---------------");
		PyramidPatterns.Pattern2(7);
		System.out.println("---------------");
		PyramidPatterns.Pattern3(6);
		System.out.println("---------------");
		PyramidPatterns.Pattern4(5);
		System.out.println("---------------");
		PyramidPatterns.Pattern5(4);
		System.out.println("---------------");
	}

}
