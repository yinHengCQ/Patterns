package Decorator.Demo;

public class Father {

	public static void main(String[] args) {
//		SchoolReport sr=new FouthGradeSchoolReport();
//		sr.report();
		
//		SchoolReport sr=new SugarFouthGradeSchoolReport();
//		sr.report();
//		sr.sign("老三");
		
		SchoolReport sr;
		sr=new FouthGradeSchoolReport();
		sr=new SortDecorator(sr);
		sr.report();
		sr.sign("老三");
	}
}
