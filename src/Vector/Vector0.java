package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Vector0 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		Enumeration en = v.elements();
		while(en.hasMoreElements()) {
			Integer i = (Integer)en.nextElement();
			System.out.println(i);
		}
	}

}
