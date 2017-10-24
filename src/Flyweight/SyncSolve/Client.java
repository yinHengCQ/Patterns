package Flyweight.SyncSolve;

public class Client {

	public static void main(String[] args) {
		ExtrinsicState state1=new ExtrinsicState();
		state1.setSubject("科目1");
		state1.setLocation("上海");
		SignInfoFactory.getSignInfo(state1);
		ExtrinsicState state2=new ExtrinsicState();
		state2.setSubject("科目1");
		state2.setLocation("上海");
		SignInfoFactory.getSignInfo(state2);
		
		long currentTime=System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			SignInfoFactory.getSignInfo(state2);
		}
		
		System.out.println("执行时间"+(System.currentTimeMillis()-currentTime));
		
		String key1="科目1上海";
		String key2="科目1上海";
		
		Flyweight.Demo.SignInfoFactory.getSignInfo(key1);
		currentTime=System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			Flyweight.Demo.SignInfoFactory.getSignInfo(key2);
		}
		System.out.println("执行时间"+(System.currentTimeMillis()-currentTime));
	}
}
