package Proxy.demo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGamePlayer player = new GamePlayer("����");
		IGamePlayer proxy=new GamePlayerProxy(player);
		System.out.println("��ʼʱ���ǣ�2009-9-25 19:23");
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("����ʱ���ǣ�2009-9-26 03:23");
	}

}
