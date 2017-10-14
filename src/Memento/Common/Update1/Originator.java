package Memento.Common.Update1;

import Memento.Common.Memento;

public class Originator implements Cloneable{

	private String state="";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	public void restoreMemento(Memento _memento){
		this.setState(_memento.getState());
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		try {
			return (Originator)super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
