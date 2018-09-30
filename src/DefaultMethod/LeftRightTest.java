package DefaultMethod;

public class LeftRightTest implements Left,Right {

	//since m1 method with the same number of method parameters are present in 
	// Left as well as right interface. There arises an ambuiguity as to which 
	//method must be invoked and thus a CE will be thrown. Now we will be required to override
	//the method and have below options
	//	1. give our own implementation
	//	2. Call the method in the Left interface explicitly using Left.super.m1();
	//	3. or Call the method in the Right interface explicitly using Right.super.m1();
	//	4. or follow all of above
	@Override
	public void m1() {
		//
		System.out.println("my own custom implementation");
		Left.super.m1();
		Right.super.m1();
	}

	public static void main(String[] args) {
		LeftRightTest leftRightTest = new LeftRightTest();
		leftRightTest .m1();
	}
	
}
