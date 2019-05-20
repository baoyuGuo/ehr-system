package com.ehr.recruitment.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrTestMapper;
import com.ehr.pojo.EhrTest;
import com.ehr.pojo.EhrTestExample;
import com.ehr.recruitment.service.ExaminationService;

@Service
public class ExaminationServiceImpl implements ExaminationService {

	@Autowired
	EhrTestMapper tMapper;
	
	@Override
	public List<EhrTest> queryAll() {
		EhrTestExample exam = new EhrTestExample();
		return tMapper.selectByExample(exam);
	}

	@Override
	public void delete(String[] param) {
		EhrTestExample exam = new EhrTestExample();
		List<Integer> ids = new ArrayList<>();
		for (String string : param) {
			ids.add(Integer.parseInt(string));
		}
		exam.createCriteria().andIdIn(ids);
		tMapper.deleteByExample(exam);
	}

}
