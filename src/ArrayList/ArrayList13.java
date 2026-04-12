package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList13 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Emp(101,"Harsh"));
		al.add(new Emp(102,"Khushal"));
		al.add(new Emp(103,"Mali"));
		Iterator li = al.iterator();
		while(li.hasNext()) {
			Emp ss = (Emp)li.next();
			System.out.println(ss.empId+"-"+ss.empName);
		}
	}

}
