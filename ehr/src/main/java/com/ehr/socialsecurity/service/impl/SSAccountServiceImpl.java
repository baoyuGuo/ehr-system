package com.ehr.socialsecurity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrAccountsMapper;
import com.ehr.pojo.EhrAccounts;
import com.ehr.pojo.EhrAccountsExample;
import com.ehr.pojo.EhrSsTypeExample;
import com.ehr.pojo.ParamMapping;
import com.ehr.socialsecurity.service.SSAccountService;

@Service
public class SSAccountServiceImpl implements SSAccountService {

	@Autowired
	EhrAccountsMapper aMapper;
	
	@Override
	public List<EhrAccounts> queryAll() {
		EhrAccountsExample exam = new EhrAccountsExample();
		exam.createCriteria().andTypeEqualTo(ParamMapping.SOCIAL_SECURITY_ACCOUNT);
		return aMapper.selectByExample(exam);
	}

	@Override
	public void delete(String[] ids) {
		List<Integer> params = new ArrayList<>();
		for (String id : ids) {
			params.add(Integer.parseInt(id));
		}
		EhrAccountsExample exam = new EhrAccountsExample();
		exam.createCriteria().andIdIn(params);
		aMapper.deleteByExample(exam);
	}

}
