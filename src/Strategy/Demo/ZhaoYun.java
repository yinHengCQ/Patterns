package Strategy.Demo;

public class ZhaoYun {

	public static void main(String[] args) {
		Context context;
		System.out.println("刚到吴国，拆第一个锦囊");
		context=new Context(new BackDoor());
		context.operate();
		System.out.println("\n\n\n");
		System.out.println("刘备乐不思蜀了，拆了第二个锦囊");
		context=new Context(new GivenGreenLight());
		context.operate();
		System.out.println("\n\n\n");
		System.out.println("孙权的小兵追来了，咋办？拆第三个锦囊");
		context=new Context(new BlockEnemy());
		context.operate();
	}
}
