package functionalInterface.predefined.Supplier;

import java.util.function.Supplier;

public class Generate6DigitOTP {
	public static void main(String[] args) {
		
		Supplier<String> getOTP = ()->{
			String otp = "";
			for(int i=1;i<=6;i++){
				otp =otp+ (int)(Math.random()*10); 
			}
			return otp;
		};
		
		//for(int i=0;i<6;i++){
			System.out.println(getOTP.get()); 
		//}
	
	}
}
