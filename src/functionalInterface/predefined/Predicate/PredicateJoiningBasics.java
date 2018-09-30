package functionalInterface.predefined.Predicate;

import java.util.function.Predicate;

public class PredicateJoiningBasics {

	public static void main(String[] args) {
		
		PredicateJoiningBasics joiningBasics = new PredicateJoiningBasics();
		
		int testArray[] = new int[]{2,5,6,8,14,19,75,100,541,125};
		
		//predicate to check if the number is greater in 10
		Predicate<Integer> isGreaterThen10 = (I)->I>10;
		
		//predicate to check if the number is even
		Predicate<Integer> isEvenNo = (I)->I%2==0;
		
		System.out.println("isGreaterThen10");
		joiningBasics.testPredicate(isGreaterThen10, testArray);
		
		System.out.println("isEvenNo");
		joiningBasics.testPredicate(isEvenNo, testArray);
		
		System.out.println("isLesserThen10");
		joiningBasics.testPredicate(isGreaterThen10.negate(), testArray);
		
		System.out.println("isOddNo");
		joiningBasics.testPredicate(isEvenNo.negate(), testArray);
		
		System.out.println("isEvenNo and isGreaterThen10");
		joiningBasics.testPredicate(isEvenNo.and(isGreaterThen10), testArray);
		
		System.out.println("isEvenNo or isGreaterThen10");
		joiningBasics.testPredicate(isEvenNo.or(isGreaterThen10), testArray);
		
	}
	public void testPredicate(Predicate<Integer> p,int x[]){
		for(int i:x)
			if(p.test(i))
				System.out.println(i);
		
	}
	
}
