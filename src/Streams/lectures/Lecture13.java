package Streams.lectures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;

import Streams.Mockdata;

public class Lecture13 {
	
	public static void main(String[] args) throws IOException {
		checkOrderOfStreams();
	}

	
	public static void checkOrderOfStreams() throws IOException {
		List<Double> filterdCars = Mockdata.getCars().stream()
			.filter(car->{
				System.out.println("filtering cars " +car);
				return car.getPrice()<10000;
			})
			.map(car->{
				System.out.println("mapping prices "+car);
				return car.getPrice();
			})
			.map(price->{
				System.out.println("before final price "+price);
				System.out.println("final price "+price*0.14);
				return price*0.14;
			})
			.collect(Collectors.toList());
		
		System.out.println("\n\n\nfinal list ");
		System.out.println(filterdCars);
	}

	
}
