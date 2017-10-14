package Proxy.demo;

public class GamePlayerProxy implements IGamePlayer {

	private IGamePlayer gameplayer=null;
	public GamePlayerProxy(IGamePlayer _gameplayer) {
		this.gameplayer = _gameplayer;
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
	}

}
