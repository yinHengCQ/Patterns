package mediator.first;

public class Stock extends AbstractColleague {

	public Stock(AbstractMediator abstractMediator) {
		super(abstractMediator);
		// TODO Auto-generated constructor stub
	}

	private static int COMPUTER_NUMBER=100;
	
	public void increase(int number){
		COMPUTER_NUMBER=COMPUTER_NUMBER+number;
		System.out.println("库存数量为："+COMPUTER_NUMBER);
	}
	
	public void decrease(int number){
		COMPUTER_NUMBER=COMPUTER_NUMBER-number;
		System.out.println("库存数量为："+COMPUTER_NUMBER);
	}

	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}
	
	public void clearStock(){
		System.out.println("清理存货数量为："+COMPUTER_NUMBER);
		super.abstractMediator.excute("stock.clear");
	}
}
