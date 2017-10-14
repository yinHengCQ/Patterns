package command;

public class Client {

	public static void main(String[] args) {
		Invoker xiaoSan=new Invoker();
		System.out.println("-----------客户要去增加一项需求-----------");
		Command command=new DeletePageCommand();
		xiaoSan.setCommand(command);
		xiaoSan.action();
	}
}
