package State.Demo;

public class Lift implements ILift{
	
	private int state;

	@Override
	public void setState(int state) {
		// TODO Auto-generated method stub
		this.state=state;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		switch (this.state) {
		case OPENING_STATE:

			break;

		case CLOSING_STATE:
			this.openWithoutLogic();
			this.setState(OPENING_STATE);
			break;
		
		case RUNNING_STATE:
			
			break;
			
		case STOPPING_STATE:
			this.openWithoutLogic();
			this.setState(OPENING_STATE);
			break;
		}
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		switch (this.state) {
		case OPENING_STATE:
			this.closeWithoutLogic();
			this.setState(CLOSING_STATE);
			break;

		case CLOSING_STATE:
			
			break;
		
		case RUNNING_STATE:
			
			break;
			
		case STOPPING_STATE:
			
			break;
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		switch (this.state) {
		case OPENING_STATE:

			break;

		case CLOSING_STATE:
			this.runWithoutLogic();
			this.setState(RUNNING_STATE);
			break;
		
		case RUNNING_STATE:
			
			break;
			
		case STOPPING_STATE:
			this.runWithoutLogic();
			this.setState(RUNNING_STATE);
			break;
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		switch (this.state) {
		case OPENING_STATE:

			break;

		case CLOSING_STATE:
			this.stopWithoutLogic();
			this.setState(CLOSING_STATE);
			break;
		
		case RUNNING_STATE:
			this.stopWithoutLogic();
			this.setState(CLOSING_STATE);
			break;
			
		case STOPPING_STATE:

			break;
		}
	}

	private void closeWithoutLogic(){
		System.out.println("电梯门关闭...");
	}
	
	private void openWithoutLogic(){
		System.out.println("电梯门开启...");
	}
	
	private void runWithoutLogic(){
		System.out.println("电梯上下运行起来...");
	}
	
	private void stopWithoutLogic(){
		System.out.println("电梯停止了...");
	}
}
