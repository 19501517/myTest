package staticTest;

public class StaticTest {

	public static void main(String[] args) {
		new MyThread("thread1").start();
		new MyThread("thread2").start();
	}
}
