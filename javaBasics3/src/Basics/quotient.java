package Basics;

public class quotient {
double divide(int dividend, int divider) {
	double quoetient = dividend / divider;
	double remainder = dividend % divider;
	System.out.println("remainder of two number is "+remainder);
	return (quoetient);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quotient obj = new quotient();
		System.out.println("quotient of two number is "+obj.divide(25, 4));
	}

}
	