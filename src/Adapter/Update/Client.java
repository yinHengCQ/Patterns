package Adapter.Update;

import Adapter.Demo.IUserInfo;

public class Client {

	public static void main(String[] args) {
		IOuterUserBaseInfo baseInfo=new OuterUserBaseInfo();
		IOuterUserHomeInfo homeInfo=new OuterUserHomeInfo();
		IOuterUserOfficeInfo officeInfo=new OuterUserOfficeInfo();
		
		IUserInfo youngGirl=new OuterUserInfo(baseInfo, homeInfo, officeInfo, baseInfo.getUserInfo(), homeInfo.getUserHomeInfo(), officeInfo.getUserOfficeInfo());
		for (int i = 0; i < 10; i++) {
			youngGirl.getMobileNumber();
		}
	}
}
