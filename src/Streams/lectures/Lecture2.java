package Streams.lectures;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.google.common.collect.ImmutableList;

import Streams.Mockdata;
import Streams.beans.Person;

public class Lecture2 {
	
	public static void main(String[] args) throws IOException {
		//Lecture2.usingRangeFunctionOnIntStream();
		//iteratingCollectionWithIntRange();
		iteratingCollectionUsingIntStreamIterator();
	}
	
	public static void usingRangeFunctionOnIntStream(){
		System.out.println("exclusive example");
		//exclusive range selector using range function
		IntStream.range(0, 10).forEach(System.out::println);
		
		System.out.println("inclusive example");
		//exclusive range selector using range function
		IntStream.rangeClosed(0, 10).forEach(System.out::println);
			
	}
	
	public static void iteratingCollectionWithIntRange() throws IOException{
		List<Person> people = Mockdata.getPeople();
		IntStream.range(0, people.size()).forEach(index->{
			System.out.println(people.get(index));
		});
	}
	
	public static void iteratingCollectionUsingIntStreamIterator() throws IOException{
		List<Person> people = Mockdata.getPeople();
		IntStream.iterate(0,operand->operand+5).limit(20).forEach(index->{
			System.out.println(people.get(index));
			});
	}
	
	
}
