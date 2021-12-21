package FOR;

public class numbers {

	static void Numbers(int n) {
		
		for (n = 10; n >= 0; n--) {
			System.out.print(" " + n);
		}
	}

	static void Numbers1(int n) {
		
		for (n = 0; n <= 10; n++) {
			System.out.print(" " + n);
		}
	}

	static void Alphabate() {
		char C1;
		for (C1 = 'a'; C1 <= 'z'; C1++) {
			System.out.print(" " + C1);
		}
	}

	static void Alphabate1() {
		char C1;
		for (C1 = 'z'; C1 >= 'a'; C1--) {
			System.out.print(" " + C1);
		}
	}

	static void Numbers2() {
		int n = 2;
		for (int i = 1; i <= 8; i++) {
			System.out.print(" " + n);
		}
	}

	static void alphabate2() {
		char C2 = 'P';
		for (int i = 1; i <= 8; i++) {
			System.out.print(" " + C2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers.Numbers(10);
		System.out.println("\n****");
		numbers.Numbers1(10);
		System.out.println("\n****");
		numbers.Alphabate();
		System.out.println("\n****");
		numbers.Alphabate1();
		System.out.println("\n****");
		numbers.Numbers2();
		System.out.println("\n****");
		numbers.alphabate2();
	}

}
