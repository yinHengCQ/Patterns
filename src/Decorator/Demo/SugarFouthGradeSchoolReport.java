package Decorator.Demo;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport{

	private void reportHighScore(){
		System.out.println("这次考试语文最高是75，数学是78，自然是80");
	}
	
	private void reportSort(){
		System.out.println("我是排名第38名...");
	}
	
	@Override
	public void report() {
		// TODO Auto-generated method stub
		this.reportHighScore();
		super.report();
		this.reportSort();
	}
}
