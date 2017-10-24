package Flyweight.SyncQuestion;

import java.util.HashMap;

import Flyweight.Demo.SignInfo;

public class SignFactory {

	private static HashMap<String, SignInfo> pool=new HashMap<>();
	
	public static SignInfo getSignInfo(String key){
		SignInfo result=null;
		if (!pool.containsKey(key)) {
			result=new SignInfo();
			pool.put(key, result);
		} else {
			result=pool.get(key);
		}
		return result;
	}
}
