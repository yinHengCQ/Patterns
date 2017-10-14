package Strategy;

public class Context {

	private Strategy strategy=null;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void doAnything(){
		this.strategy.doSomething();
	}
	
}
