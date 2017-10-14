package Decorator.Demo;

public class FouthGradeSchoolReport extends SchoolReport {

	@Override
	public void report() {
		// TODO Auto-generated method stub
		System.out.println("尊敬的XXX家长：");
		System.out.println("......");
		System.out.println("语文62 数学65 体育 98 自然 63");
		System.out.println("......");
		System.out.println("\t\t家长签名：");
	}

	@Override
	public void sign(String name) {
		// TODO Auto-generated method stub
		System.out.println("家长签名为："+name);
	}

}
