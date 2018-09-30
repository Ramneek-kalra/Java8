package DefaultMethod;

public interface Left {

	default void m1(){
		System.out.println("m1 method in left interface");
	}
	
}
