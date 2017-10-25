package Bridge.Common;

public class Client {

	public static void main(String[] args) {
		Implementor imp=new ConcreteImplmentor1();
		Abstraction abs=new RefinedAbstraction(imp);
		abs.request();
	}
}
