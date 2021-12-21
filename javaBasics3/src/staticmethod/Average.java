package staticmethod;

public class Average {
static int x,y,z;
	public static void main(String[] args) {
		Average.avg(12,15,17);
		Average.avg(22,55,18);
		Average.avg(15,15,17);
		int p=55,q=58,r=82;
		Average.avg(p,q,r);
	}
static double avg(int a,int b,int c) {
	double res = (a+b+c)/3;
	System.out.println("a "+a);
	System.out.println("b "+b);
	System.out.println("c "+c);
	System.out.println("average "+res);
	return 1;
}
}
