package prototype.testConstructor;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Thing thing=new Thing();
		
		thing.setValue("张三");
		
		Thing cloneThing=(Thing) thing.clone();
		
		cloneThing.setValue("李四");
		
		System.out.println(thing.getValue());
	}
}
