package mediator.first;

public class Client {

	public static void main(String[] args) {
		AbstractMediator abstractMediator=new Mefiator();
		System.out.println("——————————采购人员采购电脑——————————");
		Purchase purchase=new Purchase(abstractMediator);
		purchase.buyIBMComputer(100);
		System.out.println("\n——————————销售人员销售电脑——————————");
		Sale sale=new Sale(abstractMediator);
		sale.sellIBMComputer(1);
		System.out.println("\n——————————库房管理人员清理库存——————————");
		Stock stock=new Stock(abstractMediator);
		stock.clearStock();
	}
}
