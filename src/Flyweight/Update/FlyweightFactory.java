package Flyweight.Update;

import java.util.HashMap;

public class FlyweightFactory {

	private static HashMap<String, Flyweight> pool=new HashMap<>();
	
	public static Flyweight getFlyweight(String key){
		Flyweight result=null;
		if (pool.containsKey(key)) {
			result=pool.get(key);
		} else {
			result=new ConcreteFLyweight1(key);
			pool.put(key, result);
		}
		return result;
	}
}
