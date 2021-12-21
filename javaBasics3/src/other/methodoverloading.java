package other;

public class methodoverloading {

	public double square() {
		System.out.println("No Parameter Method Called");
		return 5;
	}
	public double square(int number) {
		int square = number * number;
		System.out.println("Method with Integer Argument Called:" + square);
		return square;
	}
	public double square(short number) {
		float square = number * number;
		System.out.println("Method with float Argument Called:" + square);
		return 2;
	}
	public static void main(String[] args) {
		methodoverloading obj = new methodoverloading();		
		obj.square(2);
		obj.square();
		obj.square(5);
	}
}
