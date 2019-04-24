package com.ehr.socialsecurity.service;

import java.util.List;

import com.ehr.pojo.EhrAccounts;

public interface SSAccountService {
	
	List<EhrAccounts> queryAll();
}
