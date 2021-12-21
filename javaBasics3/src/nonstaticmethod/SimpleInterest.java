package nonstaticmethod;

import nonstaticmethod.SimpleInterest;

public class SimpleInterest {
	
	
	double simpleinterest(double principle, double rate, double time)
	{
		
double interest= principle*rate*time;
System.out.println("Simple interest for the amount of "+principle+" at the rate of "+rate+ " for "+time+" year is "+interest);
return interest;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// non static method object declaration;
		SimpleInterest obj=new SimpleInterest();
		// non static method repetation;
		obj.simpleinterest(20000,0.12,2);
		obj.simpleinterest(30000,0.13,3);
		obj.simpleinterest(40000,0.14,4);
		obj.simpleinterest(50000,0.15,2);
		obj.simpleinterest(60000,0.16,3);
		obj.simpleinterest(70000,0.17,4);


	}
}
