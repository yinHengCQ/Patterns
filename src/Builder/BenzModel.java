package Builder;

public class BenzModel extends CarModel {

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("���۳�Ӧ������ͣ��...");
	}

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("���۳���������������ӵ�...");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("���۳�������������������ӵ�...");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("���۳���������������ӵ�...");
	}

}
