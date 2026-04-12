package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList14 {

	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<>();
		al.add(new Emp(101,"Harsh"));
		al.add(new Emp(102,"Khushal"));
		al.add(new Emp(103,"Mali"));
		Iterator<Emp> li = al.iterator();
		while(li.hasNext()) {
			Emp ss = li.next();
			System.out.println(ss.empId+"-"+ss.empName);
		}

	}

}
