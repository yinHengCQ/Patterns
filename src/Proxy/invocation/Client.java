package Proxy.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Date;

import Proxy.demo.GamePlayer;
import Proxy.demo.IGamePlayer;

public class Client {

	public static void main(String[] args) {
		IGamePlayer player=new GamePlayer("张三");
		InvocationHandler handler=new GamePlayIH(player);
		System.out.println("开始时间是："+new Date());
		ClassLoader cl=player.getClass().getClassLoader();
		IGamePlayer proxy=(IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是："+new Date());
	}
}
