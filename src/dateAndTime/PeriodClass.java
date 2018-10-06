package dateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.function.Supplier;

public class PeriodClass {

	public static long AVERAGE_HUMAN_AGE = 70;
	
	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(1994, Month.MARCH, 27);
		LocalDate now = LocalDate.now();
		Period period = Period.between(birthDate, now);
		System.out.printf("your age is %d years %d months and %d days",period.getYears(),period.getMonths(),period.getDays());
		
		Supplier<String> calculateDaysToDie = ()->{
			LocalDate deathDate = birthDate.plusYears(AVERAGE_HUMAN_AGE);
			Period remainingPeriod = Period.between(now, deathDate);
			String result = String.format("days left on earth :: %d", (remainingPeriod.getYears()*365)+(remainingPeriod.getMonths()*30)+(remainingPeriod.getDays()));
			return result;
		};
		System.out.println("\n"+calculateDaysToDie.get());
	}
}
