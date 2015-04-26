package dyProxy.test;

import dyProxy.service.Service;
import dyProxy.service.Impl.ServiceImpl;
import dyProxy.utils.ServiceProxy;

public class ServiceTest {

	public static void main(String[] args) {
		Service service = (Service) new ServiceProxy().bind(new ServiceImpl("admin"));
		service.doSomething();
	}
}
