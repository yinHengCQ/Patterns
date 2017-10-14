package Adapter.Update;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

	@Override
	public Map getUserOfficeInfo() {
		HashMap baseInfoMap=new HashMap<>();
		baseInfoMap.put("jobPosition", "这个人的职位是BOSS...");
		baseInfoMap.put("officeTelNumber", "员工的办公电话是...");
		return baseInfoMap;
	}

}
