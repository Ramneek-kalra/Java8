package Streams.lectures;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;

import Streams.Mockdata;
import Streams.beans.Person;
import Streams.beans.PersonDTO;

public class Lecture5 {
	public static void main(String[] args) throws IOException {
		
		//mapping from one class object to another
		List<Person> people = Mockdata.getPeople();
		List<PersonDTO> mappedDTOs = people.stream().map(person->{
			PersonDTO dtos = new PersonDTO(person.getId(), person.getFirstName(), person.getAge());
			return dtos;
		}).collect(Collectors.toList());
		
		
		//average car price
		double average = Mockdata.getCars().stream().mapToDouble((car)->car.getPrice()).average().orElse(0);
		System.out.println("average car price : "+average);
	}
}
