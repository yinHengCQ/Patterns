package Observer.Common;

public class LiSi implements Observer {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
		this.report(context);
		System.out.println("李斯：汇报完毕...\n");
	}
	
	private void report(String context){
		System.out.println("李斯：报告，秦老板！韩非子有活动了-->"+context);
	}

}
