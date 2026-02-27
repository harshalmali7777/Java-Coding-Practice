package ArrayList;
import java.util.ArrayList;
public class ArrayList7 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add('X');
		al.add(10);
		al.add("String");
		al.add(new Emp(101, "Rahul"));
		System.out.println(al);
	}

}
