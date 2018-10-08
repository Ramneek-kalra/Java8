package Streams.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Person {
	private int id;
	private String firstName;
	private String lastLame;
	private String email;
	private String gender;
	private int age;
}
