package Memento.Common.Update2;

import Memento.Common.Memento;

public class Originator implements Cloneable{
	
	private Originator backup;

	private String state="";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public void createMemento(){
		this.backup=this.clone();
	}
	
	public void restoreMemento(){
		this.setState(this.backup.getState());
	}
	
	@Override
	protected Originator clone(){
		try {
			return (Originator)super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
