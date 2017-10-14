package Singleton;

public class Minister2 {

	public static void main(String[] args) {
		int ministerNum=5;
		for (int i = 0; i < ministerNum; i++) {
			Emperor2 emperor =Emperor2.getInstance();
			System.out.println("第"+(i+1)+"个大臣参拜的是：");
			emperor.say();
		}
	}
}
