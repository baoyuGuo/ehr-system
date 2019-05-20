package com.ehr.recruitment.service;

import java.util.List;

import com.ehr.pojo.EhrTest;

public interface ExaminationService {
	
	List<EhrTest> queryAll();
	
	void delete(String[] ids);
}
