package Streams.lectures;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;

import Streams.Mockdata;
import Streams.beans.Person;
import Streams.beans.PersonDTO;

public class Lecture6 {
	public static void main(String[] args) throws IOException {
		int array[] = {1,225,2,5,8,4,87,454,4,8,9,58};
		
		findAnyTest(array);
		findFirstTest(array);
	}
	//findAny is non-deterministic i.e. it may result different results satisfying the given condition 
	//when run several times. Thus it can be used in a multi-threaded environment where fast processing is required
	private static void findAnyTest(int[] array) {
		OptionalInt any = Arrays.stream(array).filter(i->i>100).findAny();
		System.out.println(any);
	}
	//findFirst is deterministic
	private static void findFirstTest(int[] array) {
		OptionalInt first = Arrays.stream(array).filter(i->i>100).findFirst();
		System.out.println(first);
	}
}
