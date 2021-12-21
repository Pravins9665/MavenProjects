package other;

public class Ifcondition {

	public static void main(String args[])
    {
  System.out.println( Ifcondition.number());
    }
	int i = 14;
	static double number() {
		Ifcondition obj = new Ifcondition();
		 if (obj.i < 15){
	           System.out.println("i is smaller than 15");
	            return obj.i;
			}
	        else{
	          System.out.println("i is greater than 15");
	            return obj.i;
			}
		
	}
}
