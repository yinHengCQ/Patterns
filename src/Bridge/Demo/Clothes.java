package Bridge.Demo;

public class Clothes extends Product{

	@Override
	public void beProducted() {
		// TODO Auto-generated method stub
		System.out.println("生产出的衣服是这样的...");
	}

	@Override
	public void beSelled() {
		// TODO Auto-generated method stub
		System.out.println("生产出的衣服都卖出去了...");
	}

}
