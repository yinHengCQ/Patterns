package State.Common;

public class Client {

	public static void main(String[] args) {
		Context context=new Context();
		context.setState(new ConcreteState1());
		context.handle1();
		context.handle2();
	}
}
