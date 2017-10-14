package Abstract_Factory;

public abstract class AbstractYellowHuman implements Human {

	@Override
	public void getColor() {
		// TODO Auto-generated method stub
		System.out.println("黄色人种的皮肤都是黄色的！");
	}

	@Override
	public void talk() {
		// TODO Auto-generated method stub
		System.out.println("黄色人种会说话，一般说的都是双字节。");
	}

}
