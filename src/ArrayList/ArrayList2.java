package ArrayList;
import java.util.ArrayList;
public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Harshal");
		al.add("Khushal");
		al.add("Mali");
		System.out.println(al);
		for(Object o : al) {
			String ss = (String)o;
			System.out.println(ss);
		}
	}

}
