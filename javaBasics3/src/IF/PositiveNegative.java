package IF;

public class PositiveNegative {
	
	static int num;
	 void Positive() {
		num = -5;
		if(num>0) {
			System.out.println(num+"  is positive number");
		}
		if(num<0) {
			System.out.println(num+"  is negative number");
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveNegative obj = new PositiveNegative();
		obj.Positive();
		
		
	}

}
