package functionalInterface.predefined.Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierBasic {
	public static void main(String[] args) {
		Supplier<Date> getDate = ()-> new Date();
		System.out.println(getDate.get());
	}
}
