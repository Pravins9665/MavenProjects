
public class PyramidPatterns4 {
	static void Patterns1(int n) {
		int i, j, s;
		for (i = 1; i <= n; i++) {
			for (s = 1; s <= n - i; s++)
				System.out.print("  ");
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	static void Patterns2(int n) {
		int i, j, s;
		for (i = 1; i <= n; i++) {
			for (s = 1; s <= n - i; s++)
				System.out.print("  ");
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print(" "+
			j);
			}
			System.out.println();
		}
	}
	static void Patterns3(int n) {
		int i, j, s;
		for (i = 1; i <= n; i++) {
			for (s = 1; s <= n - i; s++)
				System.out.print("  ");
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print(" "+s);
			}
			System.out.println();
		}
	}
	static void Patterns4(int n) {
		int i, j, s;
		for (i = 1; i <= n; i++) {
			for (s = 1; s <= n - i; s++)
				System.out.print("  ");
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print(" "+(i));
			}
			System.out.println();
		}
	}
	static void Patterns5(int n) {
		int i, j, s, k=1;
		for (i = 1; i <= n; i++) {
			for (s = 1; s <= n - i; s++)
				System.out.print("  ");
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PyramidPatterns4.Patterns1(5);
		System.out.println("------------");
		PyramidPatterns4.Patterns2(5);
		System.out.println("------------");
		PyramidPatterns4.Patterns3(5);
		System.out.println("------------");
		PyramidPatterns4.Patterns4(5);
		System.out.println("------------");
		PyramidPatterns4.Patterns5(3);
		System.out.println("------------");
	}

}
