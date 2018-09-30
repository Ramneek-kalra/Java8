package functionalInterface.predefined.Predicate;

import java.util.function.Predicate;

/*
 * Program to check if a no. is greater then 10 using predicate functional interface
 */
public class PredicateBasics {

	public static void main(String[] args) {
		Predicate<Integer> p = (I)->I>10;
		System.out.println(p.test(100));
	}
	
}
