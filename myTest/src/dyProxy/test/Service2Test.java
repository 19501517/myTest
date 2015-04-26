package dyProxy.test;

import dyProxy.service.Service2;
import dyProxy.service.Impl.Service2Impl;
import dyProxy.utils.ServiceProxy;

public class Service2Test {

	public static void main(String[] args) {
		Service2 service2 = (Service2) new ServiceProxy().bind(new Service2Impl());
		service2.add("something");
	}
}
