package mediator.first;

public class Mefiator extends AbstractMediator {

	@Override
	public void excute(String str, Object... objects) {
		// TODO Auto-generated method stub
		if (str.equals("purchase.buy")) {
			this.buyComputer((Integer)objects[0]);
		} else if(str.equals("sale.sell")){
			this.sellComputer((Integer)objects[0]);
		}else if (str.equals("sale.offsell")) {
			this.offSell();
		}else if (str.equals("stock.clear")) {
			this.clearStock();
		}
	}
	
	@SuppressWarnings("unused")
	private void buyComputer(int number){
		int saleStatus=super.sale.getSaleStatus();
		if (saleStatus>80) {
			System.out.println("采购IBM电脑："+number+"台");
			stock.increase(number);
		} else {
			int buyNumber=number/2;
			System.out.println("采购IBM电脑："+buyNumber+"台");
		}		
	}
	
	@SuppressWarnings("unused")
	private void sellComputer(int number){
		if (super.stock.getStockNumber()<number) {
			super.purchase.buyIBMComputer(number);
		}
		super.stock.decrease(number);
	}
	
	@SuppressWarnings("unused")
	private void offSell(){
		System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
	}
	
	@SuppressWarnings("unused")
	private void clearStock(){
		super.sale.offSale();
		super.purchase.refuseBuyIBM();
	}

}
