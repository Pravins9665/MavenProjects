package Practice1;

interface basicjava {

	int a = 10;

	void method1();
}

public class sample implements basicjava {

	public static void main(String[] args) {

		sample s = new sample();
		s.method1();
	}

	@Override
	public void method1() {
		System.out.println(a);
		// TODO Auto-generated method stub

	}

	private void method2(int c) {
		System.out.println(a);
		// TODO Auto-generated method stub

	}

	private void method2() {
		System.out.println(a);
		// TODO Auto-generated method stub

	}

}
