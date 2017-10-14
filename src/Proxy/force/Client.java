package Proxy.force;

public class Client {

	public static void main(String[] args) {
		IGamePlayer player=new GamePlayer("张三");
		IGamePlayer proxy = player.getProxy();
		System.out.println("开始的时间是：2009-8-25 10:45");
		
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是：2009-8-25 20:45");
	}
}
