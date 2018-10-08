package Streams.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class PersonDTO {
	private int id;
	private String firstName;
	private int age;
}
