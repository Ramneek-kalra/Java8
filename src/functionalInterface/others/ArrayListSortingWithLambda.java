package functionalInterface.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayListSortingWithLambda {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		Random rand = new Random();
	
		for(int i=0;i<10;i++){
			int randomNum = rand.nextInt((10 - 0) + 1) + 0;
			intList.add(randomNum);
		}
		
		for(int x:intList){
			System.out.println(x);
		}
		
		Collections.sort(intList,(o1,o2)->{
			/*if(o1>o2){
				return -1;
			}else if(o1>o2){
				return 1;
			}else {
				return 0;
			}*/
			return o1>o2?-1:o1<o2?1:0;
		});
		System.out.println("After sorting");
		for(int x:intList){
			System.out.println(x);
		}
	}
}
