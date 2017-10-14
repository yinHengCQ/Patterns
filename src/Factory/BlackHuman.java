package Factory;

public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黑色人种皮肤是黑色");
	}

	@Override
	public void talk() {
		System.out.println("黑人会说话，一般人听不懂");
	}

}
