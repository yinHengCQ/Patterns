package Visitor.Demo;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		for (Employee emp : mockEmployee()) {
			emp.accept(new Visitor());
		}
	}

	public static List<Employee> mockEmployee(){
		List<Employee> list=new ArrayList<>();
		CommonEmployee zhangSan=new CommonEmployee();
		zhangSan.setJob("编写JAVA程序，绝对的蓝领、苦工加搬运工");
		zhangSan.setName("张三");
		zhangSan.setSalary(1800);
		zhangSan.setSex(Employee.MALE);
		list.add(zhangSan);
		
		CommonEmployee liSi=new CommonEmployee();
		liSi.setJob("页面美工，审美素质太不流行了！");
		liSi.setName("李四");
		liSi.setSalary(1900);
		liSi.setSex(Employee.FEMALE);
		list.add(liSi);
		
		Manager wangWu=new Manager();
		wangWu.setPerformance("基本上负值，但是我会拍马屁呀");
		wangWu.setName("王五");
		wangWu.setSalary(18750);
		wangWu.setSex(Employee.MALE);
		list.add(wangWu);
		
		return list;
	}
}
