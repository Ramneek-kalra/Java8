package functionalInterface.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomClassSortingWithLambda {

	public static void main(String[] args) {
		List<Player> playerList = new ArrayList<>(Arrays.asList(new Player[]{
				new Player("Rahul", 100),
				new Player("Hansi", 100),
				new Player("Subala", 100),
				new Player("Krishna", 800),
				new Player("Madhu", 200),
				new Player("Balram", 500),
				new Player("Ram", 800),
				new Player("udupi", 800),
				new Player("kanha", 800)
		}));
		Collections.sort(playerList,(o1,o2)->{
			if(o1.getScore()>o2.getScore()){
				return 1;
			}else if(o1.getScore()<o2.getScore()){
				return -1;
			}else {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println(playerList);
		
		System.out.println("after sorting");
		
		System.out.println(playerList);
		
		Player player =new Player("", 1){@Override
			protected Object clone() throws CloneNotSupportedException {
				// TODO Auto-generated method stub
				return super.clone();
			}};
	}
	
	
	
}

class Player{
	private String name;
	private int score;
	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public String toString() {
		return "name = "+this.name+" score "+this.score;
	}
	
}