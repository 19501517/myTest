package test;

public class Father {

	private int f1;
	
	static {
		System.out.println("father static");
	}
	
	public Father() {
		System.out.println("father init");
	}
}
