package ArrayList;
import java.util.ArrayList;
public class ArrayList8 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		System.out.println(al);
		al.add(1, 150);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		Integer i = 300;
		al.remove(i);
		System.out.println(al);
	}
}
