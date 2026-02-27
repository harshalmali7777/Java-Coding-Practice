package ArrayList;
import java.util.ArrayList;
public class ArrayList9 {

	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		al1.add(100);
		al1.add(200);
		al1.add(300);
		System.out.println(al1);
		System.out.println(al1.size());
		ArrayList al2 = new ArrayList();
		al2.add('X');
		al2.add('Y');
		al2.add('Z');
		System.out.println(al2);
		System.out.println(al2.size());
		al2.addAll(al1);
		System.out.println(al2);
		System.out.println(al2.size());
	}

}
