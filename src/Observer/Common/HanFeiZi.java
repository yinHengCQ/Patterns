package Observer.Common;

import java.util.ArrayList;

import Observer.Demo.IHanFeiZi;

public class HanFeiZi implements Observable,IHanFeiZi {

	private ArrayList<Observer> list=new ArrayList<>();
	@Override
	public void haveBreakfast() {
		// TODO Auto-generated method stub
		System.out.println("韩非子：开始吃饭了...");
		this.notifyObservers("韩非子在吃饭");
	}

	@Override
	public void haneFun() {
		// TODO Auto-generated method stub
		System.out.println("韩非子：开始娱乐了...");
		this.notifyObservers("韩非子在娱乐");
	}

	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.list.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.list.remove(observer);
	}

	@Override
	public void notifyObservers(String context) {
		// TODO Auto-generated method stub
		for (Observer observer : list) {
			observer.update(context);
		}
	}

}
