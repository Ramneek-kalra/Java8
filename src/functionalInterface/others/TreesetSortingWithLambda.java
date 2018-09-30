package functionalInterface.others;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreesetSortingWithLambda {

	public static void main(String[] args) {
		
		Set<Integer> intSet= new TreeSet<>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
		Random rand = new Random();
		for(int i=0;i<10;i++){
			int randomNum = rand.nextInt((10 - 0) + 1) + 0;
			intSet.add(randomNum);
		}
		System.out.println(intSet);
		
	}
	
}
