package com.ehr.recruitment.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrPoolMapper;
import com.ehr.pojo.EhrPool;
import com.ehr.pojo.EhrPoolExample;
import com.ehr.recruitment.service.PoolService;

@Service
public class PoolServiceImpl implements PoolService{

	@Autowired
	EhrPoolMapper pMapper;
	
	@Override
	public List<EhrPool> queryAll() {
		EhrPoolExample exam = new EhrPoolExample();
		return pMapper.selectByExample(exam);
	}

	@Override
	public void delete(String[] param) {
		List<Integer> ids = new ArrayList<>();
		for (String string : param) {
			ids.add(Integer.parseInt(string));
		}
		EhrPoolExample exam = new EhrPoolExample();
		exam.createCriteria().andIdIn(ids);
		pMapper.deleteByExample(exam);
	}

}
