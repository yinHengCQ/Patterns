package prototype.testConstructor;

import java.util.ArrayList;

public class Thing implements Cloneable {

	private ArrayList<String> arrayList=new ArrayList<>();
	
	public Thing() {
		System.out.println("构造方法被执行了");
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Thing thing=(Thing) super.clone();
		thing.arrayList=(ArrayList<String>) this.arrayList.clone();
		return thing;
	}
	
	public void setValue(String value){
		this.arrayList.add(value);
	}
	
	public ArrayList<String> getValue(){
		return this.arrayList;
	}
}
