package Proxy.count;

import Proxy.demo.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer, IProxy {

	private IGamePlayer gameplayer =null;
	@Override
	public void count() {
		// TODO Auto-generated method stub
		System.out.println("升级的费用总共是:150元");
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
