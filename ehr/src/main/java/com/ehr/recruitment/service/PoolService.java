package com.ehr.recruitment.service;

import java.util.List;

import com.ehr.pojo.EhrPool;

public interface PoolService {
	
	List<EhrPool> queryAll();
	
	void delete(String[] ids);
}
