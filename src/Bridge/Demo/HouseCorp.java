package Bridge.Demo;

public class HouseCorp extends Corp{

	public HouseCorp(House house) {
		super(house);
		// TODO Auto-generated constructor stub
	}
	
	public void makeMoney(){
		super.makeMoney();
		System.out.println("房地产公司赚大钱了...");
	}

}
