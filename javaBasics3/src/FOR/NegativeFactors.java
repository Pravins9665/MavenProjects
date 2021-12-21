package FOR;

public class NegativeFactors {

	static void Factors(int n) {
		System.out.print("number " + n + " has factor :");
		for (int i = n; i <= Math.abs(n); i++) { 
			// Math.abs(n) given a integer n as output without sign
			if (i == 0) {
				continue;
			} else {
				if (n % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factors(-36);
	}

}
