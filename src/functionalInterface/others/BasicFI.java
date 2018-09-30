package functionalInterface.others;

@FunctionalInterface
public interface BasicFI {

	public void m1();
	
	//adding below method will introduce compilation error
	//public void m2();
	
}
