package nonstaticmethod;

public class AofS {
	int a;
	 double square() {
	    	int x=10;
	    double res=x*x;
	    	System.out.println("area of square is "+res);
	    	return res;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AofS obj = new AofS();
     obj.square();
	}
   
}
