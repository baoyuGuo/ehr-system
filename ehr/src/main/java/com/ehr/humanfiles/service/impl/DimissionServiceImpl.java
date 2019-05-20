package com.ehr.humanfiles.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.humanfiles.service.DimissionService;
import com.ehr.mapper.EhrDimissionMapper;
import com.ehr.mapper.EhrEmployeeMapper;
import com.ehr.pojo.EhrDimission;
import com.ehr.pojo.EhrDimissionExample;
import com.ehr.pojo.EhrDimissionExample.Criteria;
import com.ehr.pojo.EhrEmployee;

@Service
public class DimissionServiceImpl implements DimissionService {

	@Autowired
	EhrDimissionMapper dimissionMapper;
	
	@Autowired
	EhrEmployeeMapper eMapper;
	
	@Override
	public List<EhrDimission> queryAll() {
		EhrDimissionExample exam = new EhrDimissionExample();
		return dimissionMapper.selectByExample(exam);
	}

	@Override
	public void add(EhrDimission dimission) {
		String enumber = dimission.getEnumber();
		//修改员工状态
		EhrEmployee record = eMapper.selectByPrimaryKey(enumber);
		record.setEstatus("离职");
		eMapper.updateByPrimaryKey(record);
		//新增离职详情记录
		dimissionMapper.insert(dimission);
	}

	@Override
	public void delete(String[] enumbers) {
		for (String enumber : enumbers) {
			dimissionMapper.deleteByPrimaryKey(enumber);
		}
	}

	@Override
	public List<EhrDimission> condition_query(String enumber,String ename,String edname,String type,Date starttime,Date endtime) {
		EhrDimissionExample exam = new EhrDimissionExample();
		Criteria criteria = exam.createCriteria();
		//员工姓名
		if(ename.length()!=0) {
			criteria.andEnameEqualTo(ename);
		}
		//部门名称
		if(edname.length()!=0) {
			criteria.andEdnameEqualTo(edname);
		}
		//员工工号
		if (enumber.length()!=0) {
			criteria.andEnumberEqualTo(enumber);
		}
		//离职类型
		if (type.length()!=0) {
			criteria.andTypeEqualTo(type);
		}
		//起始时间
		if(starttime!=null && endtime!=null) {
			//String字符串转化为Date
			criteria.andStartBetween(starttime, endtime);
		}else {
			if(starttime!=null) {  
				//只有起始时间
				criteria.andStartGreaterThanOrEqualTo(starttime);
			}else if(endtime != null) {
				//只有截止时间
				criteria.andStartLessThanOrEqualTo(endtime);
			}
		}
		//最后进行判断:有查询条件时进行查询,没有则返回空
		if (criteria.getAllCriteria().isEmpty()) {
			exam.clear();
		}
		return dimissionMapper.selectByExample(exam);
	}


}
