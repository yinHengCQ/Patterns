package Proxy.common;

import Proxy.demo.IGamePlayer;

public class Gameplayer implements IGamePlayer {

	private String name="";
	public Gameplayer(IGamePlayer _gamePlayer,String _name) throws Exception {
		if (_gamePlayer==null) {
			throw new Exception("不能创建角色！");
		} else {
			this.name = _name;
		}
	}

	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		System.out.println("登录名为"+user+"的用户"+this.name+"登录成功！");
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"在打怪！");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"又升了一级！");
	}

}
