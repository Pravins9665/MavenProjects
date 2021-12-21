package staticmethod;

		// TODO Auto-generated method stub

public class Day11_Method6 {
	
				    double pi=3.14;
					double radius=25;
					double area = pi*radius*radius;
				    static public double areaofcircle() {
						Day11_Method6 obj1 = new Day11_Method6();
					System.out.println("radius of circle is "+obj1.radius);
					System.out.println("area of circle is " +obj1.area);
					return obj1.area;
					}
		public static void main(String[] args) {
			
			//Day11_Method6 circle=new Day11_Method6();
			double res;
			res=Day11_Method6.areaofcircle();
			System.out.println("area of circle " +res);
			                   //or
			//circle.areaofcircle();
			
		}
						
			}



