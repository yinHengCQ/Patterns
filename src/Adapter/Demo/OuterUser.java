package Adapter.Demo;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {

	@Override
	public Map getUserBaseInfo() {
		HashMap baseInfoMap=new HashMap<>();
		baseInfoMap.put("userName", "这个员工叫做混世魔王...");
		baseInfoMap.put("mobileNumber", "这个员工的电话是...");
		return baseInfoMap;
	}

	@Override
	public Map getUserOfficeInfo() {
		HashMap baseInfoMap=new HashMap<>();
		baseInfoMap.put("homeTelNumber", "员工的家庭电话是...");
		baseInfoMap.put("homeAddress", "员工的家庭地址是...");
		return baseInfoMap;
	}

	@Override
	public Map getUserHomeInfo() {
		HashMap baseInfoMap=new HashMap<>();
		baseInfoMap.put("jobPosition", "这个人的职位是BOSS...");
		baseInfoMap.put("officeTelNumber", "员工的办公电话是...");
		return baseInfoMap;
	}

}
