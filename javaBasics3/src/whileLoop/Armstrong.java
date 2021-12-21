package whileLoop;

public class Armstrong {

	static void Arm(int n) {
		int z = n;
		int count = 0;
		int sum = 0;
		while (z > 0) {
			z = z / 10;
			count++;
	
		}
		// System.out.println("number of digits = "+count);
		z = n;
		int digit, cube = 1;
		while (z > 0) {
			digit = z % 10;
		
			for (int i = 1; i <= count; i++) {
				cube = cube * digit;
				sum = sum + cube; 
				z = z / 10;  
			}
		}
			if (sum == n) {
				System.out.println(n + " is Armstrong number");
			} else {
				System.out.println(n + " is not Armstrong number");
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong.Arm(153);
		
		// 1 + 5 + 3 = 153
	}

}
