package Streams.lectures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;

public class Lecture11 {
	
	public static void main(String[] args) throws IOException {
		joiningStringsUsingStreams();
	}
	
	private static List<String> listOfNames = Lists.newArrayList("krishna", "vishnu", "rahul", "surya", "balram");
	

	
	public static void joiningStringsUsingStreams() throws IOException {
		String joinedNames = listOfNames.stream()
				.map(String::toUpperCase)
				.collect(Collectors.joining("|"));
		System.out.println(joinedNames);
	}

	
}
