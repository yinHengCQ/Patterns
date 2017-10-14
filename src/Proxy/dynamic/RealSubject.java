package Proxy.dynamic;

public class RealSubject implements Subject{

	@Override
	public void doSomething(String str) {
		// TODO Auto-generated method stub
		System.out.println("do something!------------>"+str);
	}

	@Override
	public void show(String i,String j) {
		// TODO Auto-generated method stub
		System.out.println("i+j:"+(i+j));
	}

}
