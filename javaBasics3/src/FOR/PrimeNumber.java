package FOR;

public class PrimeNumber {

	static void prime(int n) { // number to find out is prime or not
		int count = 0; // factors of any prime number are two; starting with 0
		int i; // divider to find number of factors if modulus is 0
		for (i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2) {
			System.out.println(n + " is Prime number");
		} else {
			System.out.println(n + " is not Prime number ");
		}

	}

	static void prime1(int n) { // number to find out is prime or not
		int count = 0; // factors of any prime number is 2; starting with 0
		int i = 1; // divider to find number of factors if modulus is 0
		while (i <= n) {
			if (n % i == 0)
				count++;
			i++;
		}
		if (count == 2) {
			System.out.println(n + " is Prime number");
		} else {
			System.out.println(n + " is not Prime number ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber.prime(89);
		PrimeNumber.prime1(23);
	}

}
