package com.ehr.humanfiles.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.humanfiles.service.AdjustService;
import com.ehr.mapper.EhrAdjustmentMapper;
import com.ehr.pojo.EhrAdjustment;
import com.ehr.pojo.EhrAdjustmentExample;
import com.ehr.pojo.EhrAdjustmentExample.Criteria;
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

	@Override
	public void delete(String[] params) {
		//params长度大于0
		for (String enumber : params) {
			adjustMapper.deleteByPrimaryKey(enumber);
		}
	}

	@Override
	public List<EhrAdjustment> conditionQuery(String enumber, String ename, String title,String type, Date starttime, Date endtime) {
		EhrAdjustmentExample exam = new EhrAdjustmentExample();
		Criteria criteria = exam.createCriteria();
		if(enumber.length()!=0) {
			criteria.andEnumberEqualTo(enumber);
		}
		if(ename.length()!=0) {
			criteria.andEnameEqualTo(ename);
		}
		if(title.length()!=0) {
			criteria.andTitleEqualTo(title);
		}
		if(type.length()!=0) {
			criteria.andTypeEqualTo(type);
		}
		//起始时间
		if(starttime!=null && endtime!=null) {
			//String字符串转化为Date
			criteria.andTimeBetween(starttime, endtime);
		}else {
			if(starttime!=null) {  
				//只有起始时间
				criteria.andTimeGreaterThanOrEqualTo(starttime);
			}else if(endtime != null) {
				//只有截止时间
				criteria.andTimeLessThanOrEqualTo(endtime);
			}
		}
		return adjustMapper.selectByExample(exam);
	}
	
}
