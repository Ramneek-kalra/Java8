package Streams.lectures;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;

public class Lecture4 {
	public static void main(String[] args) {
		List<Integer> numList = ImmutableList.of(1,225,1,225,2,5,8,4,87,454,4,8,9,58);
		//finding distinct using distinct() function
		numList.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		//finding distinct using Collector.toSet()
		Set<Integer> distinctElement = numList.stream().collect(Collectors.toSet());
		System.out.println(distinctElement);
	}
}
