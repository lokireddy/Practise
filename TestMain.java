package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		Employee e1 = new Employee("Loki", 22000, 15);
		Employee e2 = new Employee("Kanth", 62000, 28);
		Employee e3 = new Employee("Anitha", 24000, 24);
		Employee e4 = new Employee("Anitha", 22000, 17);
	
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(e1);
		emps.add(e3);
		emps.add(e2);
		emps.add(e4);
		System.out.println("Before sort: " + emps);
		Collections.sort(emps, new EmpSrtByName());
		System.out.println("After sort: " + emps);
	}

}
