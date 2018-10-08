package Streams.lectures;

import java.util.Comparator;
import java.util.List;

import com.google.common.collect.ImmutableList;

public class Lecture3 {
	public static void main(String[] args) {
		List<Integer> numList = ImmutableList.of(1,225,2,5,8,4,87,454,4,8,9,58);
		System.out.println(numList.stream().max(Comparator.naturalOrder()).get());
	}
}
