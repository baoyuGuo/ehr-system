package com.ehr.performance.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrRpTypeMapper;
import com.ehr.performance.service.RewardPunishTypeService;
import com.ehr.pojo.EhrRpType;
import com.ehr.pojo.EhrRpTypeExample;

@Service
public class RewardPunishTypeServiceImpl implements RewardPunishTypeService {

	@Autowired
	EhrRpTypeMapper rptMapper;
	
	@Override
	public List<EhrRpType> queryAll() {
		EhrRpTypeExample exam = new EhrRpTypeExample();
		return rptMapper.selectByExample(exam);
	}

	@Override
	public void delete(String[] ids) {
		List<Integer> list = new ArrayList<>();
		for (String string : ids) {
			list.add(Integer.parseInt(string));
		}
		EhrRpTypeExample exam = new EhrRpTypeExample();
		exam.createCriteria().andIdIn(list);
		rptMapper.deleteByExample(exam);
	}

}
