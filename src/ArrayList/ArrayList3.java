package ArrayList;
import java.util.ArrayList;
public class ArrayList3 {

	public static void main(String[] args) {
		Emp e1 = new Emp(101,"Rahul");
		Stud s1 = new Stud(1001,"Kirti");
		String str = "Harshal Mali";
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(s1);
		al.add(str);
		for(Object o : al) {
			if(o instanceof Emp) {
				Emp ee = (Emp)o;
				System.out.println(ee.empId+"-"+ee.empName);
			}
			else if(o instanceof Stud) {
				Stud ss = (Stud)o;
				System.out.println(ss.studId+"-"+ss.studName);
			}
			else if(o instanceof String) {
				String s = (String)o;
				System.out.println(s);
			}
		}
	}

}
