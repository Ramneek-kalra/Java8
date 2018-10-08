package Streams.lectures;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import Streams.Mockdata;
import Streams.beans.Person;

public class Lecture1 {
	
	public static void main(String[] args) throws IOException {
		Lecture1.declarativeApproachUsingStreams();
	}
	
	public static void declarativeApproachUsingStreams() throws IOException{
		List<Person> people = Mockdata.getPeople();
		
		List<Person> lessThen18 = people.stream().filter(o->o.getAge()>=18).limit(10).collect(Collectors.toList());
		
		System.out.println("people with age less then 18 - "+lessThen18.size());
	}
	
}
