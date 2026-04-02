package Strings;

public class String3 {

	public static void main(String[] args) {
		String str = "hello";
		int vowel = 0, consonants = 0;
		for(char ch : str.toCharArray()) {
			if("aeiou".indexOf(ch) != -1) {
				vowel++;
			} else if (Character.isLetter(ch)) {
				consonants++;
			}
		}
		System.out.println(vowel);
		System.out.println(consonants);
	}
}
