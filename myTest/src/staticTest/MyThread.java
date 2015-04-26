package staticTest;

public class MyThread extends Thread{
	
	public MyThread(String str){
		super(str);
	}

	@Override
	public void run() {
		String threadName = getName();
		StaticMethod.printNum(threadName);
	}

}
