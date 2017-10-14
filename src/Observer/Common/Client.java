package Observer.Common;

public class Client {

	public static void main(String[] args) {
		Observer liSi=new LiSi();
		Observer wangSi=new WangSi();
		HanFeiZi hanFeiZi=new HanFeiZi();
		hanFeiZi.addObserver(liSi);
		hanFeiZi.addObserver(wangSi);
		hanFeiZi.haveBreakfast();
	}
}
