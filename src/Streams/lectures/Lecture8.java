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

public class Lecture8 {
	
	public static void main(String[] args) throws IOException {
		//SimpleGrouping();
		groupingAndCounting();
	}


	public static void SimpleGrouping() throws IOException {
		Map<String, List<Car>> groupedByMakeData = Mockdata.getCars()
				.stream()
				.collect(Collectors.groupingBy(Car::getMake));
		
		groupedByMakeData.forEach((make,cars)->{
			System.out.println(make);
			cars.forEach(car->System.out.println(car));
		});
	}
	
	public static void groupingAndCounting() throws IOException {
		Map<String, Long> groupByCarColors = Mockdata.getCars()
				.stream()
				.collect(Collectors.groupingBy(Car::getColor,Collectors.counting()));
		
		groupByCarColors.forEach((color,count)->{
			System.out.println(color+" : "+count);
		});
	}
}
