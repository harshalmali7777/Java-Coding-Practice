package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class listIterator1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add('X');
		al.add('Y');
		al.add('Z');
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			Character ch = (Character)li.next();
			System.out.println(ch);
		}

	}

}
