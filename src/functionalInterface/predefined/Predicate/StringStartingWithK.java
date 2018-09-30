package functionalInterface.predefined.Predicate;

import java.util.function.Predicate;

public class StringStartingWithK {
	public static void main(String[] args) {
		String names[] = new String[]{"KANHA","krishna","balram","madhu","subala","kanha"};
		
		Predicate<String> startsWithK = (s)->s.toLowerCase().startsWith("k");
		
		for(String name:names)
			if(startsWithK.test(name))
				System.out.println(name);
		
	}
}
