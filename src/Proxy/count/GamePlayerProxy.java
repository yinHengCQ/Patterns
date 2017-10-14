package Proxy.count;

import Proxy.demo.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer, IProxy {

	private IGamePlayer gameplayer =null;
	@Override
	public void count() {
		// TODO Auto-generated method stub
		System.out.println("�����ķ����ܹ���:150Ԫ");
	}

	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		this.gameplayer.login(user, password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		this.gameplayer.killBoss();
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		this.gameplayer.upgrade();
		this.count();
	}

}
