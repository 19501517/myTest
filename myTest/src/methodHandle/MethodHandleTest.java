package methodHandle;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

import model.User;

/**
 * 
 * @author LiuYeFeng<897908343@qq.com>
 * @date 2015年4月8日 下午10:41:13
 * @CopyRight 2015 TopView Inc
 * @version V1.0
 */
public class MethodHandleTest {

	public MethodHandle getHandler() {
		MethodHandle mh = null;
		MethodType mt = MethodType.methodType(void.class);
		MethodHandles.Lookup lk = MethodHandles.lookup();
		
		try {
			mh = lk.findVirtual(MethodHandleTest.class, "print", mt);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return mh;
	}
	
	public void print() {
		System.out.println("print");
	}
	
	public static void main(String[] args) throws Throwable {
		MethodHandleTest mht = new MethodHandleTest();
		MethodHandle mh = mht.getHandler();
		
		int result1 = (int) mh.invoke(mht);
		Object result2 = mh.invoke(mht);
		
		System.out.println("result 1:" + result1);
		System.out.println("result 2:" + result2);
	}
}
