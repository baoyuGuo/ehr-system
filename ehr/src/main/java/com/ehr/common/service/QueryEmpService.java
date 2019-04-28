package com.ehr.common.service;

import java.util.List;

import com.ehr.pojo.EhrEmployee;

public interface QueryEmpService {
	List<EhrEmployee> queryEmpByName(String ename);
}
