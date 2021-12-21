package nonstaticmethod;

public class AofS1 {
	int a;
	 double square(int x) {
	    double res=x*x;
	    	System.out.println("area of square is "+res);
	    	return res;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AofS1 obj = new AofS1();
     obj.square(10);
     obj.square(20);
     obj.square(30);
     obj.square(40);
     obj.square(50);
     
	}

}
