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
		
		OptionalInt any = Arrays.stream(array).filter(i->i>1000).findAny();
		System.out.println(any);
	}
}
