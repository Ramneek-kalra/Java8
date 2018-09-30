package functionalInterface.predefined.Predicate.employeeManagementSystem;

public class Employee {
	String name;
	String designation;
	double salary;
	String city;
	public Employee(String name, String designation, int salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	@Override
	public String toString() {
		String str = String.format("[%s,%s,%.2f,%s]",name,designation,salary,city);
		return str;
	}
	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		if(name.equals(employee.name) && designation.equals(employee.designation) && salary == employee.salary && city.equals(employee.city)){
			return true;
		}else{
			return false;
		}
	}
	
}
