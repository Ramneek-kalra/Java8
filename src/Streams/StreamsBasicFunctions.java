package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsBasicFunctions {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			numList.add((int)(Math.random()*10));
		
		System.out.println(numList);
		//get all even numbers from the list
		List<Integer> evenNumbers = numList.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println("\n even numbers\n");
		System.out.println(evenNumbers);
		
		List<Integer> doubleTheNumber = numList.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println("\n double the numbers\n");
		System.out.println(doubleTheNumber);
		
		long count = numList.stream().filter(I->I%2==0).count();
		System.out.println("\n no. of even numbers\n");
		System.out.println(count);

		List<Integer> sortedNumList = numList.stream().sorted().collect(Collectors.toList());
		System.out.println("\n sorted numbers\n");
		System.out.println(sortedNumList);
		
		//sorting using custom comparator
		List<Integer> sortedNumList2 = numList.stream().sorted((o1,o2)->-o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println("\n sorted numbers using custom comparator\n");
		System.out.println(sortedNumList2);
		
		//minimum value using comparator
		Integer minVal = numList.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("\n minimum value according to the given comparator");
		System.out.println(minVal);

		//maximum value using comparator
		Integer maxVal = numList.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("\n maximum value according to the given comparator");
		System.out.println(maxVal);
		
		//forEach Method using method reference
		//numList.stream().forEach(o->System.out.println(o));
		numList.stream().forEach(System.out::println);
		
		//toArray method using constructor reference
		Integer[] numArray = numList.stream().toArray(Integer[]::new);
		Arrays.stream(numArray).forEach(System.out::println);
	}
}
