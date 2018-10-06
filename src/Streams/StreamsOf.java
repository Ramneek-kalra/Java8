package Streams;

import java.util.stream.Stream;

public class StreamsOf {
	
	public static void main(String[] args) {
		//on any group of elements
		Stream<Integer> stream = Stream.of(9,99,999);
		stream.forEach(System.out::println);
		
		//for arrays
		Double[] a = {1.0,2.5,6.6,5.5,};
		Stream<Double> streamFromArray = Stream.of(a);
		streamFromArray.forEach(System.out::println);
		
	}	
}
