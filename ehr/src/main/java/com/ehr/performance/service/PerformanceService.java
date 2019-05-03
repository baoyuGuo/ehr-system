package com.ehr.performance.service;

import java.util.List;

import com.ehr.pojo.EhrPerformance;

public interface PerformanceService {
	
	/**
	 * 查询所有的绩效考核记录
	 * @return
	 */
	List<EhrPerformance> queryAll();
	
	/**
	 * 批量删除绩效考核记录
	 * @param enumbers
	 */
	void delete(String[] enumbers);
}
