package functionalInterface.predefined.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemoveNullAndEmpty {
	public static void main(String[] args) {
		
		List<String> testList = new ArrayList<>(Arrays.asList(new String[]{
				"aaa","",null,"bbb","","ccc",null
		}));
		
		Predicate<String> isNull = (s)->s==null;
		Predicate<String> isEmpty = (s)->s.isEmpty();
		System.out.println(testList);
		
		Iterator<String> iterator = testList.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			if(isNull.test(next) || isEmpty.test(next)){
				System.out.println("removing "+next);
				iterator.remove();
			}
		}
		System.out.println(testList);
	}
}
