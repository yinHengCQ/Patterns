package Proxy.common;

import Proxy.demo.IGamePlayer;

public class Gameplayer implements IGamePlayer {

	private String name="";
	public Gameplayer(IGamePlayer _gamePlayer,String _name) throws Exception {
		if (_gamePlayer==null) {
			throw new Exception("���ܴ�����ɫ��");
		} else {
			this.name = _name;
		}
	}

	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		System.out.println("��¼��Ϊ"+user+"���û�"+this.name+"��¼�ɹ���");
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"�ڴ�֣�");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"������һ����");
	}

}
