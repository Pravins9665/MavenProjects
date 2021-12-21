package staticmethod;

public class SimpleInterest {
	
	static double simpleinterest(double principle, double rate, double time)
	//double simpleinterest(double principle, double rate, double time)
	{
		
double interest= principle*rate*time;
System.out.println("Simple interest for the amount of "+principle+" at the rate of "+rate+ " for "+time+" year is "+interest);
return interest;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static method repetation;
		
		  SimpleInterest.simpleinterest(20000,0.12,2);
		  SimpleInterest.simpleinterest(30000,0.13,3);
		  SimpleInterest.simpleinterest(40000,0.14,4);
		  SimpleInterest.simpleinterest(50000,0.15,2);
		  SimpleInterest.simpleinterest(60000,0.16,3);
		  SimpleInterest.simpleinterest(70000,0.17,4);
		 
		
	}
}
