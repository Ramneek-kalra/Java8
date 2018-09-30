package functionalInterface.predefined.Predicate.employeeManagementSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EMS_Demo {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList = populateEmployees(empList);
		System.out.println(empList);
		
		Predicate<Employee> isManager = (emp)->emp.designation.equalsIgnoreCase("manager");
		
		Predicate<Employee> isInBangalore = (emp)->emp.city.equalsIgnoreCase("bangalore") || emp.city.equalsIgnoreCase("bangaluru") ;
		
		Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Krishna", "CEO", 1500000, "Wilston"));
		
		System.out.println("All Employees who are managers");
		display(isManager, empList);
		
		System.out.println("All Employees who are in Bangalore");
		display(isInBangalore, empList);
		
		System.out.println("All Employees who are in Bangalore");
		display(isInBangalore, empList);
		
		System.out.println("If the given employee is CEO or not");
		System.out.println(isCEO.test(new Employee("Krishna", "CEO", 1500000, "Wilston")));
	}
	
	public static void display(Predicate<Employee> predicate,List<Employee> empList){
		for(Employee emp:empList)
			if(predicate.test(emp))
				System.out.println(emp);
	}
	
	public static List<Employee> populateEmployees(List<Employee> empList){
		return Arrays.asList(new Employee[]{
				new Employee("Rahul", "Developer", 100000, "Bangalore"),
				new Employee("Balaram", "Manager", 150000, "Pune"),
				new Employee("Surya", "Senior Developer", 200000, "Delhi"),
				new Employee("Dilip", "Engineer", 95000, "Kolkata"),
				new Employee("Mayank", "Developer", 200000, "Bangalore"),
				new Employee("Krishna", "CEO", 1500000, "Wilston"),
				new Employee("Madhu", "Architect", 500000, "England"),
				new Employee("Subala", "Engineer", 100000, "New York"),
		});
	}
	
}
