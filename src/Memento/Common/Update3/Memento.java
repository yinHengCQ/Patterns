package Memento.Common.Update3;

import java.util.HashMap;

public class Memento {

	private HashMap<String, Object> stateMap;

	public Memento(HashMap<String, Object> stateMap) {
		super();
		this.stateMap = stateMap;
	}

	public HashMap<String, Object> getStateMap() {
		return stateMap;
	}

	public void setStateMap(HashMap<String, Object> stateMap) {
		this.stateMap = stateMap;
	}
}
