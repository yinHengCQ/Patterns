package Visitor.DoubleDispatch;

public class Client {

	public static void main(String[] args) {
		AbsActor actor=new OldActor();
		Role role=new KungFuRole();
		actor.act(role);
		actor.act(new KungFuRole());
	}
}
