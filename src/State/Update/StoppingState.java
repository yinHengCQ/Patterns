package State.Update;

public class StoppingState extends LiftState{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		super.context.setLiftState(context.OPENNINGSTATE);
		super.context.getLiftState().open();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.context.setLiftState(context.RUNNINGSTATE);
		super.context.getLiftState().run();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("电梯停止了...");
	}

}
