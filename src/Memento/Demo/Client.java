package Memento.Demo;

public class Client {

	public static void main(String[] args) {
		Boy boy=new Boy();
		boy.setState("心情很棒!");
		System.out.println("====男孩现在的状态====");
		System.out.println(boy.getState());
		
		Memento mem=boy.createMemento();
		
		boy.changeState();
		System.out.println("\n====男孩追女孩后的状态====");
		System.out.println(boy.getState());
		
		boy.restoreMemento(mem);
		System.out.println("\n====男孩恢复后的状态====");
		System.out.println(boy.getState());
	}
}
