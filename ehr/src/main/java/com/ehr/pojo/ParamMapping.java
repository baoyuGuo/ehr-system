package com.ehr.pojo;

import java.util.HashMap;
import java.util.Map;

public class ParamMapping {
	
	public static final String UNKNOWN_ERROR = "未知的错误";
	
	public static Map<String, String> ADJUST_TYPE = new HashMap<>();
	
	static {
		ADJUST_TYPE.put("post", "岗位调动");
		ADJUST_TYPE.put("salary", "薪资调整");
	}
}
