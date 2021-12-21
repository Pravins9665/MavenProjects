package Practice1;

public class VowelConsonent {

	public static void main(String[] args) {
		char abc = 'f';
		if ((abc == 'a' || abc == 'e' || abc == 'i' || abc == 'o' || abc == 'u')
				&& (abc == 'A' || abc == 'E' || abc == 'I' || abc == 'O' || abc == 'U')) {
			System.out.println(abc + " is vowel");
		} else {
			System.out.println(abc + " is consonent");
		}

	}

}
