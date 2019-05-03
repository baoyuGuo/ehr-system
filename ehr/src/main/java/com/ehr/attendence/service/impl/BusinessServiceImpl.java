package com.ehr.attendence.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.attendence.service.BusinessService;
import com.ehr.mapper.EhrOnbusinessMapper;
import com.ehr.pojo.EhrOnbusinessExample;

@Service
public class BusinessServiceImpl implements BusinessService {

	@Autowired
	EhrOnbusinessMapper businessMapper;
	
	@Override
	public void delete(String[] enumbers) {
		List<String> ids = new ArrayList<>();
		Collections.addAll(ids, enumbers);
		EhrOnbusinessExample exam = new EhrOnbusinessExample();
		exam.createCriteria().andEnumberIn(ids);
		businessMapper.deleteByExample(exam);
	}

}
