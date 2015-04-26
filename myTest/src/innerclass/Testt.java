package innerclass;

import java.io.IOException;
import java.sql.SQLException;

public class Testt {

	private String str = "test";

	public void print () {
		
		//运行时异常不一定要捕捉
		method1();
		
		try {
			method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void method1() throws NullPointerException, ArrayIndexOutOfBoundsException, ClassCastException {
		
	}
	
	private void method2() throws IOException {
		
	}
}
