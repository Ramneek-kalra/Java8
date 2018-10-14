package Streams.lectures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;

public class Lecture10 {
	
	public static void main(String[] args) throws IOException {
		withoutFlatMap();
		withFlatMap();
	}
	
	private static List<ArrayList<String>> listOfNames = Lists.newArrayList(
			Lists.newArrayList("krishna","vishnu"),
			Lists.newArrayList("rahul","surya","balram")
			);
	

	
	public static void withoutFlatMap() throws IOException {
		List<String> list = new ArrayList<>();
		listOfNames.forEach(arrayList->{
			arrayList.forEach(name->{
				list.add(name);
			});
		});
		System.out.println(list);
	}
	
	public static void withFlatMap() throws IOException {
		List<String> list = listOfNames.stream()
			.flatMap(List::stream)
			.collect(Collectors.toList());
		System.out.println(list);
	}
	
}
