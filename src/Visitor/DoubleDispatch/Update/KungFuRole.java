package Visitor.DoubleDispatch.Update;


public class KungFuRole implements Role {

	@Override
	public void accept(AbsActor actor) {
		// TODO Auto-generated method stub
		actor.act(this);
	}

}
