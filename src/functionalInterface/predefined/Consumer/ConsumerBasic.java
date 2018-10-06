package functionalInterface.predefined.Consumer;

import java.util.function.Consumer;

public class ConsumerBasic {
	public static void main(String[] args) {
		
		Consumer<String> consumer = (str)->System.out.println(str);;	
		
		consumer.accept("testing consumer");
	}
}
