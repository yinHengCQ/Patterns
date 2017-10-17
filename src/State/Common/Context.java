package State.Common;

public class Context {

	public final static State state1=new ConcreteState1();
	public final static State state2=new ConcreteState2();
	
	private State state;

	public void setState(State state) {
		this.state = state;
		this.state.setContext(this);
	}

	public State getState() {
		return state;
	}
	
	public void handle1(){
		this.state.handle1();
	}
	
	public void handle2(){
		this.state.handle2();
	}
}
