package dyProxy.service.Impl;

import dyProxy.service.Service;

public class ServiceImpl implements Service{
	
	private String name;
	
	public ServiceImpl(String name) {
		this.name = name;
	}

	@Override
	public void doSomething() {
		System.out.println("do something!" + this.name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
