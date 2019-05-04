package com.ehr.recruitment.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrRecruitmentPlanMapper;
import com.ehr.pojo.EhrRecruitmentPlan;
import com.ehr.pojo.EhrRecruitmentPlanExample;
import com.ehr.recruitment.service.RecruitmentPlanService;

@Service
public class RecruitmentPlanServiceImpl implements RecruitmentPlanService {

	@Autowired
	EhrRecruitmentPlanMapper rpMapper;
	
	@Override
	public List<EhrRecruitmentPlan> queryAll() {
		EhrRecruitmentPlanExample exam = new EhrRecruitmentPlanExample();
		return rpMapper.selectByExample(exam);
	}

	@Override
	public void delete(String[] ids) {
		EhrRecruitmentPlanExample exam = new EhrRecruitmentPlanExample();
		List<Integer> list = new ArrayList<>();
		for (String str : ids) {
			list.add(Integer.parseInt(str));
		}
		exam.createCriteria().andIdIn(list);
		rpMapper.deleteByExample(exam);
	}

}
