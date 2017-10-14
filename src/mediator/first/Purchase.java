package mediator.first;

public class Purchase extends AbstractColleague {

	public Purchase(AbstractMediator abstractMediator) {
		super(abstractMediator);
		// TODO Auto-generated constructor stub
	}
	
	public void buyIBMComputer(int number){
		super.abstractMediator.excute("purchase.buy", number);
	}
	
	public void refuseBuyIBM(){
		System.out.println("不再采购IBM电脑");
	}

}
