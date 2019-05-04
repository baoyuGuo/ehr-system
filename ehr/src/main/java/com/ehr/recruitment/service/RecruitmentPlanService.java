package com.ehr.recruitment.service;

import java.util.List;

import com.ehr.pojo.EhrRecruitmentPlan;

public interface RecruitmentPlanService {
	
	/**
	 * 查询所有招聘计划
	 * @return
	 */
	List<EhrRecruitmentPlan> queryAll();
	
	/**
	 * 批量删除招聘计划
	 * @param ids
	 */
	void delete(String[] ids);
}
