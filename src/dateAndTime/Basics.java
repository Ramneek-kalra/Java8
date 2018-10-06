package dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Basics {
	public static void main(String[] args) {
		
		//for getting date
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//for getting date
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//for getting date and time together
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		//for getting localdatetime object from the some past date and time value
		LocalDateTime someOldDateTime1 = LocalDateTime.of(date, time);
		System.out.println(someOldDateTime1);
		//representing 27-march-1994 09:27
		LocalDateTime someOldDateTime2 = LocalDateTime.of(1994,03,27,9,27);
		System.out.println(someOldDateTime2);
		System.out.println("after 6 months "+someOldDateTime2.plusMonths(6));
	}
}
