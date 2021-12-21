package whileLoop;

public class armstrong1 {

	public static void main(String[] args) {

		int n = 13;
		int num = n;
		int cubesum = 0;
		int r;
		
		while (num > 0) {
			r = num % 10;
			cubesum = cubesum + (r * r * r);
			num = num / 10;
		}
		
		if (n == cubesum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}
}
