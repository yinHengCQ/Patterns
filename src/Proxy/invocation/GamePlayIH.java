package Proxy.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler {

	Class cls=null;
	Object obj=null;
	
	public GamePlayIH(Object _obj) {
		this.obj = _obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result=method.invoke(this.obj, args);
		if (method.getName().equalsIgnoreCase("login")) {
			System.out.println("有人在用我的账号登录！");
		}
		return result;
	}

}
