package com.ehr.appeal.service;

import java.util.List;

import com.ehr.pojo.EhrAppeal;

public interface AppealService {
	
	/**
	 * 查询所有的申诉记录
	 * @return
	 */
	List<EhrAppeal> queryAll();
	
	/**
	 * 批量删除记录
	 * @param enumbers
	 */
	void delete(String[] enumbers);
	
	/**
	 * 条件查询申诉记录
	 * @param enumber
	 * @param ename
	 * @param type
	 * @return
	 */
	List<EhrAppeal> conditionQuery(String enumber, String ename , String type);
}
