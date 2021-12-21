package IF;

public class Calculator {
	
	static void Calc(int a, int b, int ch) {
		if(ch==1)
			System.out.println("Addition of a & b is "+(a+b));
		else if(ch==2)
			System.out.println("substraction of a & b is "+(a-b));
		else if(ch==3)
			System.out.println("multiplication of a & b is "+(a*b));
		else if(ch==4)
			System.out.println("division of a & b is "+(a/b));
		else if(ch==5)
			System.out.println("modulus of a & b is "+(a%b));
		else if(ch==6) {
			System.out.println("square root of a is "+(a^1/2));
		System.out.println("square root of b is "+(b^1/2));
		}
		else
			System.out.println("Invalid input");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Calculator.Calc(20, 10, 1);
 Calculator.Calc(20, 10, 2);
 Calculator.Calc(20, 10, 3);
 Calculator.Calc(20, 10, 4);
 Calculator.Calc(20, 10, 5);
 Calculator.Calc(20, 10, 6);
		
	}

}
