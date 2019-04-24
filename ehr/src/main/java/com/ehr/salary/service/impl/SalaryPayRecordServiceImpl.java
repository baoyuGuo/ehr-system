package com.ehr.salary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrPayRecordMapper;
import com.ehr.pojo.EhrPayRecord;
import com.ehr.pojo.EhrPayRecordExample;
import com.ehr.pojo.ParamMapping;
import com.ehr.salary.service.SalaryPayRecordService;

@Service
public class SalaryPayRecordServiceImpl implements SalaryPayRecordService {

	@Autowired
	EhrPayRecordMapper prMapper;
	
	@Override
	public List<EhrPayRecord> queryAll() {
		EhrPayRecordExample exam = new EhrPayRecordExample();
		exam.createCriteria().andTypeEqualTo(ParamMapping.SALARY_ACCOUNT);
		return prMapper.selectByExample(exam);
	}


}
