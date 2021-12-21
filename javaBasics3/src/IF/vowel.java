package IF;

public class vowel {
	void vowel_consonant(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch + " is a vowel");
		}
		else {
			System.out.println(ch + " is a consonant");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowel obj = new vowel();
		obj.vowel_consonant('c');
		obj.vowel_consonant('z');
		obj.vowel_consonant('i');
		obj.vowel_consonant('o');
		obj.vowel_consonant('p');
		

	}

}
