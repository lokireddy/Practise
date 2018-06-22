package sorting;

public class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	private int age;
	
	
	public Employee(String name, int salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) {
		return this.age-o.getAge();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}	
	
}
