package com.ehr.salary.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrAccountsMapper;
import com.ehr.pojo.EhrAccounts;
import com.ehr.pojo.EhrAccountsExample;
import com.ehr.pojo.EhrAccountsExample.Criteria;
import com.ehr.pojo.ParamMapping;
import com.ehr.salary.service.SalaryAccountService;

@Service
public class SalaryAccountServiceImpl implements SalaryAccountService {

	@Autowired
	EhrAccountsMapper aMapper;
	
	@Override
	public List<EhrAccounts> queryAll() {
		EhrAccountsExample exam = new EhrAccountsExample();
		exam.createCriteria().andTypeEqualTo(ParamMapping.SALARY_ACCOUNT);
		return aMapper.selectByExample(exam);
	}

	@Override
	public void delete(String[] enumbers) {
		EhrAccountsExample exam = new EhrAccountsExample();
		for (String enumber : enumbers) {
			exam.clear();
			exam.createCriteria().andEnumberEqualTo(enumber);
			aMapper.deleteByExample(exam);
		}
	}

	@Override
	public List<EhrAccounts> conditionQuery(String enumber, String ename, String type, Date starttime, Date endtime) {
		EhrAccountsExample exam = new EhrAccountsExample();
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
		return aMapper.selectByExample(exam);
	}

}
