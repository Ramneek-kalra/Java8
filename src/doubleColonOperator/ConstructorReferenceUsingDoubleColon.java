package doubleColonOperator;

public class ConstructorReferenceUsingDoubleColon {
	public ConstructorReferenceUsingDoubleColon() {
		System.out.println("Sample constructor execution and object creationg");
	}
	public static void main(String[] args) {
		interf2 i = ConstructorReferenceUsingDoubleColon::new;
		i.get();
	}
	
	
}
interface interf2{
	public ConstructorReferenceUsingDoubleColon get();
}