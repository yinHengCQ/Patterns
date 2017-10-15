package Visitor.Common;

public class ConcreteElement2 extends Element{

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("业务逻辑2");
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
}
