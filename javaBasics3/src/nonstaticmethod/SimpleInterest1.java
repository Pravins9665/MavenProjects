package nonstaticmethod;


public class SimpleInterest1 {
	
	double principle=10000;
	double rate=0.12;
	double time=2;
	double simpleinterest()
	{
		
double interest= principle*rate*time;
System.out.println("Simple interest for the amount of "+principle+" at the rate of "+rate+ " for "+time+" year is "+interest);
return interest;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// non static method object declaration;
		SimpleInterest1 obj=new SimpleInterest1();
		// non static method repetation;
		obj.simpleinterest();
		


	}
}
