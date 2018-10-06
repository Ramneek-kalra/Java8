package dateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Zone {
	public static void main(String[] args) {
		ZoneId id = ZoneId.systemDefault();
		System.out.println(id);
		
		//getting all zones available
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		availableZoneIds.stream().forEach(System.out::println);
		
		//getting date and time for any zone
		ZoneId canadaZone = ZoneId.of("Canada/Central");
		ZonedDateTime canadaZoneTime = ZonedDateTime.now(canadaZone);
		System.out.println("\nCanada/Central : "+canadaZoneTime);
	}
}
