package Visitor.Common.MultipleVisitor;

import Visitor.Demo.CommonEmployee;
import Visitor.Demo.Manager;

public class TotalVisitor implements ITotalVisitor {
	
	private final static int MANAGER_COEFFICIENT=5;
	private final static int COMMONEMPLOYEE_COEFFICIENT=2;
	
	private int commonTotalSalary=0;
	private int managerTotalSalary=0;

	@Override
	public void visit(CommonEmployee commonEmployee) {
		// TODO Auto-generated method stub
		this.commonTotalSalary=this.commonTotalSalary+commonEmployee.getSalary()*COMMONEMPLOYEE_COEFFICIENT;
	}

	@Override
	public void visit(Manager manager) {
		// TODO Auto-generated method stub
		this.managerTotalSalary=this.managerTotalSalary+manager.getSalary()*MANAGER_COEFFICIENT;
	}

	@Override
	public void totalSalary() {
		// TODO Auto-generated method stub
		System.out.println("本公司的月工资总额是"+(this.commonTotalSalary+this.managerTotalSalary));
	}

}
