package Strings;

public class String4 {

	public static void main(String[] args) {
		String str = "hi there";
		int space = 0;
		
		for(char ch : str.toCharArray()) {
			if(ch != ' ') {
				space++;
			}
		}
		System.out.println(space);
	}

}
