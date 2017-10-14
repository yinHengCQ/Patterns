package Memento.Common;

public class Client {

	public static void main(String[] args) {
		Originator originator=new Originator();
		CareTaker careTaker=new CareTaker();
		careTaker.setMemento(originator.createMemento());
		originator.restoreMemento(careTaker.getMemento());
	}
}
