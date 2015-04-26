package dyProxy.service.Impl;

import dyProxy.service.Service2;

public class Service2Impl implements Service2 {

	@Override
	public void add(String something) {
		System.out.println("add:" + something); 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
