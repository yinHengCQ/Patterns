package State.Common;

public class ConcreteState1 extends State{

	@Override
	public void handle1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handle2() {
		// TODO Auto-generated method stub
		super.context.setState(context.state2);
		super.context.handle2();
	}

}
