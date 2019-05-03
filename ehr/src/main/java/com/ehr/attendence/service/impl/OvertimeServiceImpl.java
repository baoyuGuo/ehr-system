package com.ehr.attendence.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.attendence.service.OvertimeService;
import com.ehr.mapper.EhrOvertimeMapper;
import com.ehr.pojo.EhrOvertimeExample;

@Service
public class OvertimeServiceImpl implements OvertimeService {

	@Autowired
	EhrOvertimeMapper oMapper;
	
	@Override
	public void delete(String[] enumbers) {
		List<String> ids = new ArrayList<>();
		Collections.addAll(ids, enumbers);
		EhrOvertimeExample exam = new EhrOvertimeExample();
		exam.createCriteria().andEnumberIn(ids);
		oMapper.deleteByExample(exam);
	}

}
