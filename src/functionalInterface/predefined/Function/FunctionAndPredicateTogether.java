package functionalInterface.predefined.Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionAndPredicateTogether {

	public static void main(String[] args) {
		List<Student> stdList = Arrays.asList(new Student[]{
				new Student("Rahul", 87),
				new Student("Krishna", 100),
				new Student("Balram", 100),
				new Student("Madhu", 54),
				new Student("Subala", 61),
				new Student("Hansi", 21),
		});
		
		Function<Student, String> gradeCalculator = (student)->{
			if(student.marks>=80 && student.marks<=100){
				return "A";
			}else if(student.marks>60 && student.marks<70){
				return "B";
			}else{
				return "C";
			}
		};
		
		Predicate<Student> marksMoreThen60 = (student)->student.marks>60;	
		
		for(Student std:stdList)
			if(marksMoreThen60.test(std))
				System.out.println(std.name+" : "+gradeCalculator.apply(std));
	}
	
}

class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
}
