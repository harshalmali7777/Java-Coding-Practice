package ArrayList;
import java.util.ArrayList;
public class ArrayList5 {

	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(101, "Rahul"));
		al.add(new Emp(202, "Dev"));
		al.add(new Emp(303, "Nitin"));
		for(Emp e : al) {
			System.out.println(e.empId+"-"+e.empName);
		}
	}

}
