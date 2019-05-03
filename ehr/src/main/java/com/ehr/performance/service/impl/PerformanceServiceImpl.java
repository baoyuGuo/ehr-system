package com.ehr.performance.service.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrPerformanceMapper;
import com.ehr.performance.service.PerformanceService;
import com.ehr.pojo.EhrPerformance;
import com.ehr.pojo.EhrPerformanceExample;

@Service
public class PerformanceServiceImpl implements PerformanceService {

	@Autowired
	EhrPerformanceMapper pMapper;
	
	@Override
	public List<EhrPerformance> queryAll() {
		EhrPerformanceExample example = new EhrPerformanceExample();
		List<EhrPerformance> list = pMapper.selectByExample(example);
		return list;
	}

	@Override
	public void delete(String[] enumbers) {
		List<String> ids = new ArrayList<>();
		Collections.addAll(ids, enumbers);
		EhrPerformanceExample exam = new EhrPerformanceExample();
		exam.createCriteria().andEnumberIn(ids);
		pMapper.deleteByExample(exam);
	}

}
