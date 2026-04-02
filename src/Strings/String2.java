package Strings;

public class String2 {

	public static void main(String[] args) {
		String str = "madam";
		String pali = new StringBuilder(str).reverse().toString();
		
		if(str.equals(pali)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not Palindrom");
		}
	}

}
