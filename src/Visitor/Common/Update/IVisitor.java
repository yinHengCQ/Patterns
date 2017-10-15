package Visitor.Common.Update;

import Visitor.Demo.CommonEmployee;
import Visitor.Demo.Manager;

public interface IVisitor {

	public void visit(CommonEmployee commonEmployee);
	
	public void visit(Manager manager);
	
	public int getTotalSalary();
}
