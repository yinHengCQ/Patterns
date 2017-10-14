package Abstract_Factory;

public class NvWa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanFactory maleHumanFactory = new MealeFactory();
		HumanFactory femaleHumanFactory = new FemaleFactory();
		
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		
		femaleYellowHuman.getColor();
		femaleYellowHuman.getSex();
		femaleYellowHuman.talk();
		
		System.out.println("--------------------------------");
		
		maleYellowHuman.getColor();
		maleYellowHuman.getSex();
		maleYellowHuman.talk();
	}

}
