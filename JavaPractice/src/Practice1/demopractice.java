package Practice1;

public class demopractice {

	static int b=4;    //static variable
	int c=5;           //non static variable

	public static void main(String[] args) {
		
		demopractice dp = new demopractice(); //object creation
		int a = 10;       //local variable
		
		System.out.println(b);
		  //or
		//System.out.println(demopractice.b);
		System.out.println(a);
		System.out.println(dp.c);

	}

}
