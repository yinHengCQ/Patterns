package Builder;

public class BMWModel extends CarModel {

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("����Ӧ������ͣ��...");
	}

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("������������������ӵ�...");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("����������������������ӵ�...");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("������������������ӵ�...");
	}

}
