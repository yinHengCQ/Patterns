package Abstract_Factory;

public class MealeFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		// TODO Auto-generated method stub
		return new MaleYellowHuman();
	}

	@Override
	public Human createBlackHuman() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Human createWhiteHuman() {
		// TODO Auto-generated method stub
		return null;
	}

}
