package Memento.Common.Update5;

public class Originator {
	private String state="";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public IMemento	createMemento(){
		return (IMemento) new Memento(this.state);
	}
	
	public void restoreMemento(IMemento _memento){
		this.setState(((Memento)_memento).getState());
	}
	
	private class Memento implements IMemento{
		private String state="";

		private Memento(String _state) {
			this.state = _state;
		}

		private String getState() {
			return state;
		}

		private void setState(String state) {
			this.state = state;
		}	
		
	}
}
