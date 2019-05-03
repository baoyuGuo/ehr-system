package com.ehr.attendence.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.attendence.service.HolidayService;
import com.ehr.mapper.EhrOnholidayMapper;
import com.ehr.pojo.EhrOnholidayExample;

@Service
public class HolidayServiceImpl implements HolidayService {

	@Autowired
	EhrOnholidayMapper hMapper;
	
	@Override
	public void delete(String[] enumbers) {
		List<String> ids = new ArrayList<>();
		Collections.addAll(ids, enumbers);
		EhrOnholidayExample exam = new EhrOnholidayExample();
		exam.createCriteria().andEnumberIn(ids);
		hMapper.deleteByExample(exam);
	}

}
