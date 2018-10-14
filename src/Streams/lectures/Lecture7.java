package Streams.lectures;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
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

public class Lecture7 {
	
	
	
	public static void main(String[] args) throws IOException {
		min();
		average();
		sum();
		statistics();
	}

	private static void min() throws IOException {
		ImmutableList<Car> cars = Mockdata.getCars();
		OptionalDouble min = cars.stream()
			.filter((car)->car.getColor().equalsIgnoreCase("yellow"))
			.mapToDouble(Car::getPrice)
			.min();
		System.out.println(min);
	}
	
	private static void average() throws IOException {
		ImmutableList<Car> cars = Mockdata.getCars();
		double average = cars.stream()
			.mapToDouble(Car::getPrice)
			.average()
			.orElse(0);
		System.out.println(average);
	}
	
	private static void sum() throws IOException {
		ImmutableList<Car> cars = Mockdata.getCars();
		double average = cars.stream()
			.mapToDouble(Car::getPrice)
			.sum();
		System.out.println(average);
		System.out.println(new BigDecimal(average));
	}
	
	private static void statistics() throws IOException {
		ImmutableList<Car> cars = Mockdata.getCars();
		DoubleSummaryStatistics statistics = cars.stream()
			.mapToDouble(Car::getPrice)
			.summaryStatistics();
		System.out.println(statistics);
		System.out.println(statistics.getAverage());
		System.out.println(statistics.getCount());
		System.out.println(statistics.getMax());
		System.out.println(statistics.getMin());
		
	}
	
	
}
