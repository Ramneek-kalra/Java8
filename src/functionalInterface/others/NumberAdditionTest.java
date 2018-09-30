package functionalInterface.others;

class NumberAdditionTest{
	public static void main(String[] args) {
		NumberAddition numberAddition = (a,b)->{return a+b;};
		
		int sum = numberAddition.add(10, 20);
		System.out.println("sum is " + sum);
	}
}