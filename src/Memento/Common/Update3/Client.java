package Memento.Common.Update3;

public class Client {

	public static void main(String[] args) {
		Originator ori=new Originator();
		
		CareTaker careTaker=new CareTaker();
		ori.setState1("中国");
		ori.setState2("强盛");
		ori.setState3("繁荣");
		System.out.println("====初始化状态====\n"+ori);
		
		careTaker.setMemento(ori.createMemento());
		
		ori.setState1("软件");
		ori.setState2("架构");
		ori.setState3("优秀");
		System.out.println("\n====修改后状态====\n"+ori);
		
		ori.restoreMemento(careTaker.getMemento());
		System.out.println("\n====恢复后的状态====\n"+ori);
	}
}
