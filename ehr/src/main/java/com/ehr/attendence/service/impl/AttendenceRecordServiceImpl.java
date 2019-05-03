package com.ehr.attendence.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.attendence.service.AttendenceService;
import com.ehr.mapper.EhrAttendenceMapper;
import com.ehr.pojo.EhrAttendenceExample;

@Service
public class AttendenceRecordServiceImpl implements AttendenceService{

	@Autowired
	EhrAttendenceMapper attendenceMapper;
	
	@Override
	public void delete(String[] enumbers) {
		List<String> ids = new ArrayList<>();
		Collections.addAll(ids, enumbers);
		EhrAttendenceExample exam = new EhrAttendenceExample();
		exam.createCriteria().andEnumberIn(ids);
		attendenceMapper.deleteByExample(exam);
	}

}
