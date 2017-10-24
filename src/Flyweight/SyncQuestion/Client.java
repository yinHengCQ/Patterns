package Flyweight.SyncQuestion;

import Flyweight.Demo.SignInfo;

public class Client {

	public static void main(String[] args) {
		SignFactory.getSignInfo("科目1");
		SignFactory.getSignInfo("科目2");
		SignFactory.getSignInfo("科目3");
		SignFactory.getSignInfo("科目4");
		
		SignInfo signInfo=SignFactory.getSignInfo("科目2");
		
		while (true) {
			signInfo.setId("ZhangSan");
			signInfo.setLocation("ZhangSan");
			(new MultiThread(signInfo)).start();
			signInfo.setId("LiSi");
			signInfo.setLocation("LiSi");
			(new MultiThread(signInfo)).start();
		}
	}
}
