package Visitor.Common.MultipleVisitor;

import Visitor.Demo.CommonEmployee;
import Visitor.Demo.Employee;
import Visitor.Demo.Manager;

public class ShowVisitor implements IShowVisitor {
	
	private String info="";

	@Override
	public void visit(CommonEmployee commonEmployee) {
		// TODO Auto-generated method stub
		this.info=this.info+this.getBasicInfo(commonEmployee)+"工作："+commonEmployee.getJob()+"\t\n";
	}

	@Override
	public void visit(Manager manager) {
		// TODO Auto-generated method stub
		this.info=this.info+this.getBasicInfo(manager)+"业绩："+manager.getPerformance()+"\t\n";

	}

	@Override
	public void report() {
		// TODO Auto-generated method stub
		System.out.println(this.info);
	}
	
	private String getBasicInfo(Employee employee){
		String info="姓名："+employee.getName()+"\t";
		info=info+"性别："+(employee.getSex()==Employee.FEMALE?"女":"男")+"\t";
		info=info+"薪水："+employee.getSalary()+"\t";
		return info;
	}

}
