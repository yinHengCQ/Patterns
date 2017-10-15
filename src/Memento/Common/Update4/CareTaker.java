package Memento.Common.Update4;

import java.util.HashMap;

import Memento.Common.Update3.Memento;

public class CareTaker {

	private HashMap<String, Memento> memMap=new HashMap<>();
	public Memento getMemento(String idx){
		return memMap.get(idx);
	}
	
	public void setMemento(String idx,Memento memento){
		this.memMap.put(idx, memento);
	}
}
