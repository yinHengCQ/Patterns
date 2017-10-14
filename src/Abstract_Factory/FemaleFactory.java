package Abstract_Factory;

public class FemaleFactory implements HumanFactory {

	@Override
	public Human createYellowHuman() {
		// TODO Auto-generated method stub
		return new FemaleYellowHuman();
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
