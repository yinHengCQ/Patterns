package Flyweight.SyncSolve;

import java.util.HashMap;

import Flyweight.Demo.SignInfo;

public class SignInfoFactory {

	private static HashMap<ExtrinsicState, SignInfo> pool=new HashMap<>();
	
	public static SignInfo getSignInfo(ExtrinsicState key){
		SignInfo result=null;
		if (pool.containsKey(key)) {
			result=pool.get(key);
		} else {
			result=new SignInfo();
			pool.put(key, result);
		}
		return result;
	}
}
