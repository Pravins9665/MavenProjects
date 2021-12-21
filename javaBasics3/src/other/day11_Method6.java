package other;

public class day11_Method6 {
	static double pi=3.14;
	double radius=25;
	
	public double areaofcircle() {
	double area = pi*radius*radius;
	return area;
	//System.out.println("areaofcircle" +area);
	}			
	static public void radius() {
	System.out.println("radius");
	return;
	}
public static void main(String[] args) {

day11_Method6 circle=new day11_Method6();
double res;
res=circle.areaofcircle();
System.out.println("areaofcircle " +res);
               //or
//circle.areaofcircle();
//System.out.println("areaofcircle " +circle.areaofcircle());
	day11_Method6.radius();
}
		
}

