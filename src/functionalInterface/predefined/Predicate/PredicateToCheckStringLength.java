package functionalInterface.predefined.Predicate;

import java.util.function.Predicate;

public class PredicateToCheckStringLength {
	public static void main(String[] args) {
		Predicate<String> p = (s)->s.length()>5;
		System.out.println(p.test("Krishna"));
	}
}
