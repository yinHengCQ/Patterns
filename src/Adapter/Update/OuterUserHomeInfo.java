package Adapter.Update;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserHomeInfo{

	@Override
	public Map getUserHomeInfo() {
		HashMap baseInfoMap=new HashMap<>();
		baseInfoMap.put("homeTelNumber", "员工的家庭电话是...");
		baseInfoMap.put("homeAddress", "员工的家庭地址是...");
		return baseInfoMap;
	}

}
