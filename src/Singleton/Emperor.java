package Singleton;

public class Emperor {

	private static Emperor emperor =null;
	
	private Emperor(){
		
	}
	
	public static synchronized Emperor getInstance(){
		if (emperor==null) {
			emperor=new Emperor();
		}
		return emperor;	
	}
	
	public static void say(){
		System.out.println("Œ“æÕ «ª µ€£°");
	}
}
