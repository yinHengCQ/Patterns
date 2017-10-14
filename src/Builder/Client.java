package Builder;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> sequence=new ArrayList<>();
		sequence.add("engine boom");
		sequence.add("start");
		sequence.add("stop");
		BenzBuilder benzBuilder= new BenzBuilder();
		benzBuilder.setSequence(sequence);
		BenzModel benz=(BenzModel) benzBuilder.getCarModel();
		benz.run();
	}

}
