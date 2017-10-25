package Bridge.Common;

public class RefinedAbstraction extends Abstraction{

	public RefinedAbstraction(Implementor imp) {
		super(imp);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		super.request();
		super.getImp().doAnything();
	}

}
