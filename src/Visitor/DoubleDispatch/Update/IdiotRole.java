package Visitor.DoubleDispatch.Update;

public class IdiotRole implements Role {

	@Override
	public void accept(AbsActor actor) {
		// TODO Auto-generated method stub
		actor.act(this);
	}

}
