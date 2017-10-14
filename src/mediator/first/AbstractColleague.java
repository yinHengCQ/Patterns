package mediator.first;

public abstract class AbstractColleague {
	protected AbstractMediator abstractMediator;

	public AbstractColleague(AbstractMediator abstractMediator) {
		this.abstractMediator = abstractMediator;
	}
}
