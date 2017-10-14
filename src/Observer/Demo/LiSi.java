package Observer.Demo;

public class LiSi implements ILiSi {

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println("李斯：观察到韩非子的活动，开始向老板汇报了...");
		this.reportToQinShiHuang(context);
		System.out.println("李斯：汇报完毕...\n");
	}
	
	public void reportToQinShiHuang(String reportContext){
		System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
	}

}
