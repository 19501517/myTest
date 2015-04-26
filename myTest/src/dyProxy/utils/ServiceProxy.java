package dyProxy.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiceProxy implements InvocationHandler{

	private Object target = null;
	
	public ServiceProxy (){
		
	}
	

	//接口绑定
	public Object bind(Object obj){
		this.target = obj;
		return Proxy.newProxyInstance
				(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	//调用方法时，代理进行调用
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		long before = System.currentTimeMillis();
		
		result = method.invoke(target, args);
		
		long after = System.currentTimeMillis();
		System.out.println("Method " + method.getName() + " run at " + getTime());
		System.out.println("It used " + (after - before) + " ms");
		return result;

	}
	
	private String getTime(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String time = dateFormat.format(new Date());
		return time;
	}
	
}
