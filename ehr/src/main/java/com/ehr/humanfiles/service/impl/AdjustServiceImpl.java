package com.ehr.humanfiles.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.humanfiles.service.AdjustService;
import com.ehr.mapper.EhrAdjustmentMapper;
import com.ehr.pojo.EhrAdjustment;
import com.ehr.pojo.EhrAdjustmentExample;
import com.ehr.pojo.ParamMapping;

@Service
public class AdjustServiceImpl  implements AdjustService{

	@Autowired
	EhrAdjustmentMapper adjustMapper;
	
	
	@Override
	public List<EhrAdjustment> queryAll() {
		EhrAdjustmentExample exam = new EhrAdjustmentExample();
		return adjustMapper.selectByExample(exam);
	}

	@Override
	public List<EhrAdjustment> queryByTitle(String title) {
		EhrAdjustmentExample exam = new EhrAdjustmentExample();
		exam.createCriteria().andTitleEqualTo(title);
		return adjustMapper.selectByExample(exam);
	}

	@Override
	public List<EhrAdjustment> queryByType(String type) {
		EhrAdjustmentExample exam = new EhrAdjustmentExample();
		exam.createCriteria().andTypeEqualTo(ParamMapping.ADJUST_TYPE.get(type));
		return adjustMapper.selectByExample(exam);
	}
	
}
