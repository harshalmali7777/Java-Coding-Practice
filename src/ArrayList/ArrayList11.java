package ArrayList;

import java.util.ArrayList;

public class ArrayList11 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Emp(101,"Cyber"));
		//Extract -> For
		for(Object oo : al) {
			Emp ss =(Emp)oo;
			System.out.println(ss.empId+"-"+ss.empName);
		}

		//Extract -> get()
		Object o = al.get(0);
		Emp ee = (Emp)al.get(0);
		System.out.println(ee.empId+"-"+ee.empName);
	}

}
