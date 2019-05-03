package com.ehr.socialsecurity.service.impl;

import java.util.ArrayList;
import java.util.Collections;
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

	@Override
	public void delete(String[] ids) {
		List<Integer> params = new ArrayList<>();
		for (String id : ids) {
			params.add(Integer.parseInt(id));
		}
		EhrSsTypeExample exam = new EhrSsTypeExample();
		exam.createCriteria().andIdIn(params);
		sstMapper.deleteByExample(exam);
	}

}
