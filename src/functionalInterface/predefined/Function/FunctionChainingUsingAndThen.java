package functionalInterface.predefined.Function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class FunctionChainingUsingAndThen{

	public static void main(String[] args) {
		
		List<Integer> testList = new ArrayList<>();
		
		Function<List<Integer>,List<Integer>> populateList = (list)->{
			for(int i=0;i<10;i++){
				list.add((int)(Math.random()*11));
			}
			System.out.println(list);
			return list;
		};
		
		Function<List<Integer>,List<Integer>> sortListInDescendingOrder = (list)->{
			Collections.sort(list, (o1,o2)->{
				return o1>o2?-1:o1<o2?1:0;
			});
			return list;
		};
		
		Function<List<Integer>,List<Integer>> filterGreaterthen7 = (list)->{
			Iterator<Integer> iterator = list.iterator();
			while(iterator.hasNext()) {
				Integer next = iterator.next();
				if(next>7)
					iterator.remove();
			}
			return list;
		};
		
		
		populateList
			.andThen(sortListInDescendingOrder)
			.andThen(filterGreaterthen7)
			.apply(testList);
		
		System.out.println("\nafter applying all the functions");
		System.out.println("\n"+testList);
	}
	
}
