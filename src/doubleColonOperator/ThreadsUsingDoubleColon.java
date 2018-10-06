package doubleColonOperator;

public class ThreadsUsingDoubleColon {
	public static void main(String[] args) {
		Thread t1 = new Thread(ThreadsUsingDoubleColon::test);
		t1.start();
	}
	
	public static void test() {
		System.out.println("inside test");
	}
	
}
