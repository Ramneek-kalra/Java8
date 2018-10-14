package Streams.lectures;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;

import Streams.Mockdata;
import Streams.beans.Car;
import Streams.beans.Person;
import Streams.beans.PersonDTO;

public class Lecture9 {
	
	public static void main(String[] args) throws IOException {
		reduceMethod();
	}


	public static void reduceMethod() throws IOException {
		int x[] = {4,88,5,4,11,4,7,55,989,7,0,5};
		
		int max = Arrays.stream(x).reduce(0,Integer::max);
		System.out.println(max);
		
		int sum = Arrays.stream(x).reduce(0,Integer::sum);
		System.out.println(sum);
	}
}
