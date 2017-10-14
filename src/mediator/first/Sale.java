package mediator.first;

import java.util.Random;

public class Sale extends AbstractColleague {

	public Sale(AbstractMediator abstractMediator) {
		super(abstractMediator);
		// TODO Auto-generated constructor stub
	}
	public void sellIBMComputer(int number){
		super.abstractMediator.excute("sale.sell", number);
		System.out.println("销售IBM电脑"+number+"台");
	}
	
	public int getSaleStatus(){
		Random random=new Random(System.currentTimeMillis());
		int saleStatus=random.nextInt(100);
		System.out.println("IBM电脑的销售情况为："+saleStatus);
		return saleStatus;
	}
	
	public void offSale(){
		super.abstractMediator.excute("sale.offsell");
	}
}
