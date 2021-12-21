package nonstaticmethod;

public class degreetofahrenheit {
	double tempreture(double degreecelsius) {
		double fahrenheit = (degreecelsius * 1.8)+32;
		System.out.println(degreecelsius + " degreecelsius is equal to " + fahrenheit+ " fahrenheit");
		return fahrenheit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		degreetofahrenheit obj= new degreetofahrenheit();
		obj.tempreture(35);
		obj.tempreture(55);
		obj.tempreture(75);
		obj.tempreture(95);
	}
	
}
