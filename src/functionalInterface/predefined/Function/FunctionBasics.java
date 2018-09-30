package functionalInterface.predefined.Function;

import java.util.function.Function;

public class FunctionBasics {
	public static void main(String[] args) {
		
		//length of string
		Function<String, Integer> findStringLength = (str)->str.length();
		System.out.println(findStringLength.apply("sss"));
		
		//replace all the spaces in the given string
		Function<String, String> replaceSpaces = (str)->str.replaceAll(" ", "");
		System.out.println(replaceSpaces.apply(" I  am the Boss Here "));
		
		//count number of spaces in the given string
		Function<String, char[]> convertToCharArray = (str)->str.toCharArray();
		System.out.println(convertToCharArray.apply(" I  am the Boss Here "));
		
		//count number of spaces in the given string
		Function<String, Integer> countNumberOfSpaces = (str)->str.length() - replaceSpaces.apply(str).length();
		System.out.println(countNumberOfSpaces.apply(" I  am the Boss Here "));
				
	}
}
