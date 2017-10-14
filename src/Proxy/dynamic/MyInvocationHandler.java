package Proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{

	private Object target=null;
		
	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(method.getName());
		System.out.println(args.length);
		for (Object object : args) {
			System.out.println(object);
		}
		return method.invoke(target, args);
	}

}
