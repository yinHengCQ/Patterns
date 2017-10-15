package Visitor.Common.Update;

import Visitor.Demo.CommonEmployee;
import Visitor.Demo.Manager;

public class Visitor implements IVisitor {
	
	private final static int MANAGER_COEFFICIENT=5;
	private final static int COMMONEMPLOYEE_COEFFICENT=2;
	
	private int commonTotalSalary=0;
	private int managerTotalSalary=0;

	@Override
	public void visit(CommonEmployee commonEmployee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Manager manager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTotalSalary() {
		// TODO Auto-generated method stub
		return this.commonTotalSalary+this.managerTotalSalary;
	}

	private void calManagerSalary(int salary){
		this.managerTotalSalary=this.commonTotalSalary+salary*MANAGER_COEFFICIENT;
	}
	
	private void calCommonSalary(int salary){
		this.commonTotalSalary=this.commonTotalSalary+salary*COMMONEMPLOYEE_COEFFICENT;
	}
}
