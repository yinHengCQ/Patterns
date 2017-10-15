package Visitor.DoubleDispatch;

public class OldActor extends AbsActor{

	public void act(KungFuRole role){
		System.out.println("年龄大了，不能演功夫角色");
	}
}
