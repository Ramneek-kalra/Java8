package functionalInterface.predefined.Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CollectionSize {
	public static void main(String[] args) {
		Predicate<Collection<Integer>> predicate = (c)->c.isEmpty();
		System.out.println(predicate.test(new ArrayList<>()));
	}
}
