package com.ehr.salary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrAccountsMapper;
import com.ehr.pojo.EhrAccounts;
import com.ehr.pojo.EhrAccountsExample;
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

}
