package Composite.Demo;

import java.util.ArrayList;

public class Root implements IRoot {

	private ArrayList subordinateList=new ArrayList<>();
	private String name="";
	private String position="";
	private int salary=0;
	
	
	public Root(String name, String position, int salary) {
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
	public void add(IBranch branch) {
		// TODO Auto-generated method stub
		this.subordinateList.add(branch);
	}

	@Override
	public void add(ILeaf leaf) {
		// TODO Auto-generated method stub
		this.subordinateList.add(leaf);
	}

	@Override
	public ArrayList getSubordinateInfo() {
		// TODO Auto-generated method stub
		return this.subordinateList;
	}

}
