package Factory;

public class YellowHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("��ɫ���ֵ�Ƥ���ǻ�ɫ");
	}

	@Override
	public void talk() {
		System.out.println("��ɫ���ֻ�˵����һ��˵����˫�ֽ�");
	}

}
