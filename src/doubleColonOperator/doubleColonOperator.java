package doubleColonOperator;

public class doubleColonOperator {
	public static void main(String[] args) {
		
		//method reference for static method
		interf i = doubleColonOperator::m2;
		i.m1();
		
		//method reference for instance method
		interf i2 = new doubleColonOperator()::m3;
		i2.m1();		
	}
	
	public static int m2(){
		System.out.println("inside m2");
		return 1;
	}
	
	public int m3(){
		System.out.println("inside m3");
		return 1;
	}
}

interface interf{
	public void m1();
}