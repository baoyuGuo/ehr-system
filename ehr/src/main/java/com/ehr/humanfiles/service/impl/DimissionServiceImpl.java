package com.ehr.humanfiles.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.humanfiles.service.DimissionService;
import com.ehr.mapper.EhrDimissionMapper;
import com.ehr.mapper.EhrEmployeeMapper;
import com.ehr.pojo.EhrDimission;
import com.ehr.pojo.EhrDimissionExample;
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

}
