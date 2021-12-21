package staticmethod;

class call {
	public static void main(String[] args) {
		System.out.println("i am call class");
	}
}
public class areaofcircle {
	static void areacircle(int radius) {
	double pi= 3.14;
	double area = pi*radius*radius;
	System.out.println("area of circle is "+ area);
	return;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		areaofcircle.areacircle(10);
		areaofcircle.areacircle(15);
		areaofcircle.areacircle(20);
		areaofcircle.areacircle(25);
	}
}



