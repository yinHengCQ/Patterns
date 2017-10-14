package Adapter.Update;

import java.util.Map;

import Adapter.Demo.IUserInfo;

public class OuterUserInfo implements IUserInfo {
	private IOuterUserBaseInfo baseInfo=null;
	private IOuterUserHomeInfo homeInfo=null;
	private IOuterUserOfficeInfo officeInfo=null;
	
	private Map baseMap=null;
	private Map homeMap=null;
	private Map officeMap=null;

	public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo,
			Map baseMap, Map homeMap, Map officeMap) {
		super();
		this.baseInfo = baseInfo;
		this.homeInfo = homeInfo;
		this.officeInfo = officeInfo;
		this.baseMap = baseMap;
		this.homeMap = homeMap;
		this.officeMap = officeMap;
	}

	@Override
	public String getUserName() {
		String homeAddress=(String) this.baseMap.get("userName");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getHomeAddress() {
		String homeAddress=(String) this.homeMap.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getMobileNumber() {
		String homeAddress=(String) this.baseMap.get("mobileNumber");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getOfficeTelNumber() {
		String homeAddress=(String) this.officeMap.get("officeTelNumber");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getJobPosition() {
		String homeAddress=(String) this.officeMap.get("jobPosition");
		System.out.println(homeAddress);
		return homeAddress;
	}

	@Override
	public String getHomeTelNumber() {
		String homeAddress=(String) this.homeMap.get("homeTelNumber");
		System.out.println(homeAddress);
		return homeAddress;
	}

}
