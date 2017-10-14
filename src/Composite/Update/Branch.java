package Composite.Update;

import java.util.ArrayList;

public class Branch implements IBranch{
	private String name="";
	private String position="";
	private int salary=0;
	ArrayList<ICorp> subordinateList=new ArrayList<>();
	

	public Branch(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	@Override
	public String getInfo() {
		String info="";
		info="名称："+this.name;
		info=info+"\t职位："+this.position;
		info=info+"\t薪水："+this.salary;
		return info;
	}

	@Override
	public void addSubordinate(ICorp iCorp) {
		// TODO Auto-generated method stub
		this.subordinateList.add(iCorp);
	}

	@Override
	public ArrayList<ICorp> getSubordinate() {
		// TODO Auto-generated method stub
		return this.subordinateList;
	}

}
