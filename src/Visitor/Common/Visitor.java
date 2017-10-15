package Visitor.Common;

public class Visitor implements IVisitor{

	@Override
	public void visit(ConcreteElement1 concreteElement1) {
		// TODO Auto-generated method stub
		concreteElement1.doSomething();
	}

	@Override
	public void visit(ConcreteElement2 concreteElement2) {
		// TODO Auto-generated method stub
		concreteElement2.doSomething();
	}

}
