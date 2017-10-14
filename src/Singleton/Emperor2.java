package Singleton;

import java.util.ArrayList;
import java.util.Random;

public class Emperor2 {

	private static int maxNumOfEmperor =2;
	private static ArrayList<String> nameList=new ArrayList<String>();
	private static ArrayList<Emperor2> emperorList=new ArrayList<>();
	private static int countNumOfEmperor=0;
	
	static{
		for (int i = 0; i < maxNumOfEmperor; i++) {
			emperorList.add(new Emperor2("»Ê"+(i+1)+"µÛ"));
		}
	}
	
	private Emperor2(){
		
	}
	
	private Emperor2(String name){
		nameList.add(name);
	}
	
	public static Emperor2 getInstance(){
		Random random=new Random();
		countNumOfEmperor=random.nextInt(maxNumOfEmperor);
		return emperorList.get(countNumOfEmperor);
	}
	
	public static void say(){
		System.out.println(nameList.get(countNumOfEmperor));
	}
}
