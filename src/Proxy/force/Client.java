package Proxy.force;

public class Client {

	public static void main(String[] args) {
		IGamePlayer player=new GamePlayer("����");
		IGamePlayer proxy = player.getProxy();
		System.out.println("��ʼ��ʱ���ǣ�2009-8-25 10:45");
		
		proxy.login("zhangsan", "password");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("����ʱ���ǣ�2009-8-25 20:45");
	}
}
