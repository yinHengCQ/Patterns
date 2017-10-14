package Factory;

public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黄色人种的皮肤是黄色");
	}

	@Override
	public void talk() {
		System.out.println("黄色人种会说话，一般说的是双字节");
	}

}
