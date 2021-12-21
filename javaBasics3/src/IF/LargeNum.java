package IF;

public class LargeNum {
	static void largest(double num1, double num2, double num3) {

		if (num1 > num2 && num1 > num3) {
			System.out.println("The largest number is " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The largest number is " + num2);
		} else {
			System.out.println("The largest number is " + num3);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargeNum.largest(1546, 4580, 440);
		LargeNum.largest(10.5, -4.5, 4657.444);
		LargeNum.largest(1.1, 1.11, 1.111);
		LargeNum.largest(-0.111, -0.11, -0.1);
		LargeNum.largest(-9.456, 98, 5);
	}

	
}
