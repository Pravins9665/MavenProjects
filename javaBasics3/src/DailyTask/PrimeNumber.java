package DailyTask;

public class PrimeNumber {

	void prime(int n) {
		int count = 0;
		int i;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber obj = new PrimeNumber();
		obj.prime(10);
		obj.prime(7);

	}

}
