package Observer.Demo;

public class Spy extends Thread {

	private HanFeiZi hanFeiZi;
	private LiSi liSi;
	private String type;
	public Spy(HanFeiZi hanFeiZi, LiSi liSi, String type) {
		super();
		this.hanFeiZi = hanFeiZi;
		this.liSi = liSi;
		this.type = type;
	}
	
	@Override
	public void run() {
		while (true) {
			if (this.type.equals("breakfast")) {
				if (this.hanFeiZi.isHaveBreakfast()) {
					this.liSi.update("韩非子在吃饭");
					this.hanFeiZi.setHaveBreakfast(false);
				}
			} else {
				if (this.hanFeiZi.isHaveFun()) {
					this.liSi.update("韩非子在娱乐");
					this.hanFeiZi.setHaveFun(false);
				}
			}
			
		}
	}
}
