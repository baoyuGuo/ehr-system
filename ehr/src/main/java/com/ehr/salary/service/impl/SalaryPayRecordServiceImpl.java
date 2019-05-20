package com.ehr.salary.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrPayRecordMapper;
import com.ehr.pojo.EhrPayRecord;
import com.ehr.pojo.EhrPayRecordExample;
import com.ehr.pojo.EhrPayRecordExample.Criteria;
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

	@Override
	public void delete(String[] enumbers) {
		EhrPayRecordExample exam = new EhrPayRecordExample();
		for (String enumber : enumbers) {
			exam.clear();
			exam.createCriteria().andEnumberEqualTo(enumber);
			prMapper.deleteByExample(exam);
		}
	}

	@Override
	public List<EhrPayRecord> conditionQuery(String enumber, String ename, String type, Date starttime, Date endtime) {
		EhrPayRecordExample exam = new EhrPayRecordExample();
		Criteria criteria = exam.createCriteria();
		if(enumber.length()!=0) {
			criteria.andEnumberEqualTo(enumber);
		}
		if(ename.length()!=0) {
			criteria.andEnameEqualTo(ename);
		}
		if(type.length()!=0) {
			criteria.andTypeEqualTo(type);
		}
		//起始时间
		if(starttime!=null && endtime!=null) {
			//String字符串转化为Date
			criteria.andCreatedateBetween(starttime, endtime);
		}else {
			if(starttime!=null) {  
				//只有起始时间
				criteria.andCreatedateGreaterThanOrEqualTo(starttime);
			}else if(endtime != null) {
				//只有截止时间
				criteria.andCreatedateLessThanOrEqualTo(endtime);
			}
		}
		return prMapper.selectByExample(exam);
	}


}
