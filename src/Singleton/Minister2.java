package Singleton;

public class Minister2 {

	public static void main(String[] args) {
		int ministerNum=5;
		for (int i = 0; i < ministerNum; i++) {
			Emperor2 emperor =Emperor2.getInstance();
			System.out.println("��"+(i+1)+"���󳼲ΰݵ��ǣ�");
			emperor.say();
		}
	}
}
