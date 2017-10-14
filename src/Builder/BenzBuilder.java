package Builder;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

	private BenzModel benz=new BenzModel();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		// TODO Auto-generated method stub
		this.benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		// TODO Auto-generated method stub
		return this.benz;
	}

}
