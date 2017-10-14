package Observer.Common;

import java.util.Vector;

public abstract class Subject {

	private Vector<Observer> obs=new Vector<>();
	public void addObserver(Observer observer){
		this.obs.add(observer);
	};
	public void deleteObserver(Observer observer){
		this.obs.remove(observer);
	};
	public void notifyObservers(String context){
		for (Observer observer : obs) {
			observer.update(context);
		}
	};
}
