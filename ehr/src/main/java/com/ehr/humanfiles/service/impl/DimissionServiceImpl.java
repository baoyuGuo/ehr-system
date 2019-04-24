package com.ehr.humanfiles.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.humanfiles.service.DimissionService;
import com.ehr.mapper.EhrDimissionMapper;
import com.ehr.pojo.EhrDimission;
import com.ehr.pojo.EhrDimissionExample;

@Service
public class DimissionServiceImpl implements DimissionService {

	@Autowired
	EhrDimissionMapper dimissionMapper;
	
	@Override
	public List<EhrDimission> queryAll() {
		EhrDimissionExample exam = new EhrDimissionExample();
		return dimissionMapper.selectByExample(exam);
	}

}
