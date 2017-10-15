package Visitor.Common;

public class ConcreteElement1 extends Element {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("业务逻辑1");
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
