package com.ehr.system.service;

import java.util.List;

import com.ehr.pojo.EhrUser;

public interface UserService {
	
	List<EhrUser> queryAll();
	
	void delete(String[] ids);
	
}
