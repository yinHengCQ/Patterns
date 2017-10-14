package Observer.Update;

import Observer.Demo.IHanFeiZi;
import Observer.Demo.ILiSi;
import Observer.Demo.LiSi;

public class HanFeiZi implements IHanFeiZi {

	private ILiSi liSi=new LiSi();
	@Override
	public void haveBreakfast() {
		// TODO Auto-generated method stub
		System.out.println("韩非子：开始吃饭了...");
		this.liSi.update("韩非子在吃饭");
	}

	@Override
	public void haneFun() {
		// TODO Auto-generated method stub
		System.out.println("韩非子：开始娱乐了...");
		this.liSi.update("韩非子在娱乐");
	}

}
