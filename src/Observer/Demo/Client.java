package Observer.Demo;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		LiSi liSi=new LiSi();
		HanFeiZi hanFeiZi=new HanFeiZi();
		Spy watchBreakfast=new Spy(hanFeiZi, liSi, "breakfast");
		watchBreakfast.start();
		Spy watchFun=new Spy(hanFeiZi, liSi, "fun");
		watchFun.start();
		hanFeiZi.haveBreakfast();
		Thread.sleep(1000);
		hanFeiZi.haneFun();
	}
}
