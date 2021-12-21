package Practice1;

public class objectarray {

	public static void main(String[] args) {

		Object obj[] = new Object[5];
		obj[0] = 10;
		obj[1] = 10.20;
		obj[2] = "java";
		obj[3] = 'z';
		obj[4] = 55000;
		
		for(Object arr : obj) {
			System.out.println(arr+" ");
		}
		
	}

}
