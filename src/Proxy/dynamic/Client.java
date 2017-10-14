package Proxy.dynamic;

import java.lang.reflect.InvocationHandler;

public class Client {

	public static void main(String[] args) {
		Subject subject=new RealSubject();
//		InvocationHandler handler=new MyInvocationHandler(subject);
//		Subject proxy=DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
		Subject proxy=SubjectDynamicProxy.newProxyInstance(subject);
		proxy.doSomething("Finish");
		System.out.println("========================");
		proxy.show("这是","什么");
	}
}
