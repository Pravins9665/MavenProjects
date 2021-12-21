
public class PyramidPatterns1 {

	static void Patterns1(int n) {
		int j;
		for (; n >= 1; n--) {
			for (j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void Patterns2(int n) {
		int j;
		for (; n >= 1; n--) {
			for (j = 1; j <= n; j++) {
				System.out.print(" " + (j + 1));
			}
			System.out.println();
		}
	}

	static void Patterns3(int n) {
		int j, k = 1;
		for (; n >= 1; n--) {
			for (j = 1; j <= n; j++) {
				System.out.print(" " + k);
			}
			k++;
			System.out.println();
		}
	}

	static void Patterns4(int n) {
		int j;
		for (; n >= 1; n--) {
			for (j = 1; j <= n; j++) {
				System.out.print(" " + n);
			}
			System.out.println();
		}
	}

	static void Patterns5(int n) {
		int j;
		for (; n >= 1; n--) {
			for (j = 1; j <= n; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}

	static void Patterns6(int n) {
		int j, k = 1;
		for (; n >= 1; n--) {
			for (j = 1; j <= n; j++) {
				System.out.print(k + " ");
				k++;
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PyramidPatterns1.Patterns1(5);
		System.out.println("------------");
		PyramidPatterns1.Patterns2(5);
		System.out.println("------------");
		PyramidPatterns1.Patterns3(5);
		System.out.println("------------");
		PyramidPatterns1.Patterns4(5);
		System.out.println("------------");
		PyramidPatterns1.Patterns5(5);
		System.out.println("------------");
		PyramidPatterns1.Patterns6(4);
		System.out.println("------------");
	}

}
