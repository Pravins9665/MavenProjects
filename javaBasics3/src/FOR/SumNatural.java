package FOR;

public class SumNatural {

	static void NtrlSum(int n) {             
		int sum = n * (n + 1) / 2;
		System.out.println("The sum of " + n + " natural number is " + sum);
	}

	static void NtrlSum1(int n) {       
		int i, sum = 0;                  // upto what number u want to find sum
		for (i = 1; i <= n; ++i) {
			sum = sum + i;
		}
		System.out.println("The sum of " + n + " natural number is " + sum);
	}
	static void NtrlSum2(int n) {
		int i= 1;
		int sum = 0;
		while ( i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println("The sum of " + n + " natural number is " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumNatural.NtrlSum(3);
		SumNatural.NtrlSum1(3);
		SumNatural.NtrlSum2(3);
	}

}
