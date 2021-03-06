package com.ehr.socialsecurity.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrSsRecordsMapper;
import com.ehr.pojo.EhrSsRecords;
import com.ehr.pojo.EhrSsRecordsExample;
import com.ehr.pojo.EhrSsRecordsExample.Criteria;
import com.ehr.socialsecurity.service.SSRecordService;


/**
 * @author guobaoyu
 * 员工社保入保记录
 */
@Service
public class SSRecordServiceImpl implements SSRecordService {

	@Autowired
	EhrSsRecordsMapper ssrMapper;
	
	@Override
	public List<EhrSsRecords> queryAll() {
		EhrSsRecordsExample exam = new EhrSsRecordsExample();
		return ssrMapper.selectByExample(exam);
	}

	@Override
	public void delete(String[] enumbers) {
		EhrSsRecordsExample exam = new EhrSsRecordsExample();
		List<String> values = new ArrayList<>();
		Collections.addAll(values, enumbers);
		exam.createCriteria().andEnumberIn(values);
		ssrMapper.deleteByExample(exam);
	}

	@Override
	public List<EhrSsRecords> conditionQuery(String enumber, String ename, String type, String contractnum,
			Date starttime, Date endtime) {
		EhrSsRecordsExample exam = new EhrSsRecordsExample();
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
		if(contractnum.length()!=0) {
			criteria.andContractnumEqualTo(contractnum);
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
		return ssrMapper.selectByExample(exam);
	}
}
