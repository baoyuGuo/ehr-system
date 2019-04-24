package com.ehr.pojo;

import java.util.HashMap;
import java.util.Map;

public class ParamMapping {
	
	public static final String UNKNOWN_ERROR = "未知的错误";
	
	public static Map<String, String> ADJUST_TITLE = new HashMap<>();
	
	public static Map<String, String> ADJUST_TYPE = new HashMap<>();
	
	public static Map<String, String> ACCOUNT_TYPE = new HashMap<>();
	
	public static final String SALARY_ACCOUNT = "薪资账户";
	public static final String SOCIAL_SECURITY_ACCOUNT = "社保账户";
	static {
		//调动title
		ADJUST_TITLE.put("post", "岗位调动");
		ADJUST_TITLE.put("salary", "薪资调整");
		
		//调动类型
		ADJUST_TYPE.put("reinstate","复职" );
		ADJUST_TYPE.put("suspension","停职" );
		
		//账户类型
		ACCOUNT_TYPE.put("salary", "薪资账户");
		ACCOUNT_TYPE.put("socialsecurity", "社保账户");
	}
}
