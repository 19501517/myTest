package test;

public class Son extends Father{

	private int f2;
	
	static {
		System.out.println("son static");
	}
	
	public Son() {
		super();
		System.out.println("son init");
	}
}
