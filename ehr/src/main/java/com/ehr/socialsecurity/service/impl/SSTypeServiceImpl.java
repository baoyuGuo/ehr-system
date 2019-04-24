package com.ehr.socialsecurity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrSsTypeMapper;
import com.ehr.pojo.EhrSsType;
import com.ehr.pojo.EhrSsTypeExample;
import com.ehr.socialsecurity.service.SSTypeService;

@Service
public class SSTypeServiceImpl implements SSTypeService {

	@Autowired
	EhrSsTypeMapper sstMapper;
	
	@Override
	public List<EhrSsType> queryAll() {
		EhrSsTypeExample exam = new EhrSsTypeExample();
		return sstMapper.selectByExample(exam);
	}

}
