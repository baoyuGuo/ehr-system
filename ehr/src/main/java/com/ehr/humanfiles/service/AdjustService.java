package com.ehr.humanfiles.service;

import java.util.List;

import com.ehr.pojo.EhrAdjustment;

public interface AdjustService {
	List<EhrAdjustment> queryAll();
	
	//根据title查询调整记录
	List<EhrAdjustment> queryByTitle(String title);
}
