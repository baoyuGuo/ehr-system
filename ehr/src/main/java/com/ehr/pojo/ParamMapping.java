package com.ehr.pojo;

import java.util.HashMap;
import java.util.Map;

public class ParamMapping {
	
	public static final String UNKNOWN_ERROR = "未知的错误";
	
	public static Map<String, String> ADJUST_TITLE = new HashMap<>();
	
	public static Map<String, String> ADJUST_TYPE = new HashMap<>();
	
	static {
		//调动title
		ADJUST_TITLE.put("post", "岗位调动");
		ADJUST_TITLE.put("salary", "薪资调整");
		
		//调动类型
		ADJUST_TYPE.put("reinstate","复职" );
		ADJUST_TYPE.put("suspension","停职" );
	}
}
