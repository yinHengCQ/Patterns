package Observer.Common;

public class WangSi implements Observer{

	@Override
	public void update(String context) {
		// TODO Auto-generated method stub
		System.out.println("王斯：观察到韩非子活动，自己也开始活动了...");
		this.cry(context);
		System.out.println("王斯：哭死了...\n");
	}
	
	private void cry(String context){
		System.out.println("王斯：因为"+context+",--所以我悲伤了啊~");
	}

}
