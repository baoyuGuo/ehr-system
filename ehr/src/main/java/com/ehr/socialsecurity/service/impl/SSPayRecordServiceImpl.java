package com.ehr.socialsecurity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrPayRecordMapper;
import com.ehr.pojo.EhrPayRecord;
import com.ehr.pojo.EhrPayRecordExample;
import com.ehr.pojo.ParamMapping;
import com.ehr.socialsecurity.service.SSPayRecordService;

@Service
public class SSPayRecordServiceImpl implements SSPayRecordService {

	@Autowired
	EhrPayRecordMapper prMapper;
	
	@Override
	public List<EhrPayRecord> queryAll() {
		EhrPayRecordExample exam = new EhrPayRecordExample();
		exam.createCriteria().andTypeEqualTo(ParamMapping.SOCIAL_SECURITY_ACCOUNT);
		return prMapper.selectByExample(exam);
	}

	@Override
	public void delete(String[] enumbers) {
		EhrPayRecordExample exam = new EhrPayRecordExample();
		for (String enumber : enumbers) {
			exam.clear();
			exam.createCriteria().andEnumberEqualTo(enumber);
			prMapper.deleteByExample(exam);
		}
	}
}
