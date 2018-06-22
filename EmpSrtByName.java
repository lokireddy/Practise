package sorting;

import java.util.Comparator;

public class EmpSrtByName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getName().compareTo(e2.getName()) == 0){
			return e1.getAge()-e2.getAge();
		}else 
			return e1.getName().compareTo(e2.getName());
	}

}
