package staticmethod;

public class degreetofahrenheit {
static double tempreture(double degreecelsius) {
	double fahrenheit = (degreecelsius * 1.8)+32;
	System.out.println(degreecelsius + " degreecelsius is equal to " + fahrenheit+ " fahrenheit");
	return fahrenheit;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
degreetofahrenheit.tempreture(35);
degreetofahrenheit.tempreture(55);
degreetofahrenheit.tempreture(75);
degreetofahrenheit.tempreture(95);
	}

}
