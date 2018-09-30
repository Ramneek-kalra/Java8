package functionalInterface.others;

public class BasicFI_Test {

	public static void main(String[] args) {
		
		//here it is the reference of the Interf interface that is holding 
		//the implementation for m1() method. The compiler infers the given 
		//implementation belongs to m1() as 
		//there exist only one method in that interface
		BasicFI i = ()->System.out.println("this is a lambda expression");
		
		i.m1();
	}
	
}
