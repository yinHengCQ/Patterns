package State.Common;

public class ConcreteState2 extends State {

	@Override
	public void handle1() {
		// TODO Auto-generated method stub
		super.context.setState(context.state2);
		super.context.handle2();
	}

	@Override
	public void handle2() {
		// TODO Auto-generated method stub
		
	}

}
