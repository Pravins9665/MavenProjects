package FOR;

public class PositiveFactors {
	static void Factors(int n) {
		int i;
		System.out.print("number " + n + " has factor :");
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveFactors.Factors(36);
	}
}