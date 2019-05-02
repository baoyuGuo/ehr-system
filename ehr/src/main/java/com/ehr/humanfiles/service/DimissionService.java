package com.ehr.humanfiles.service;

import java.util.List;

import com.ehr.pojo.EhrDimission;

public interface DimissionService {
	/**
	 * @return
	 * 查询所有的离职记录
	 */
	List<EhrDimission> queryAll();
	
	/**
	 * @param dimission
	 * 新增离职记录
	 */
	void add(EhrDimission dimission);
	
	/**
	 * @param enumbers
	 * 批量删除离职记录
	 */
	void delete(String[] enumbers);
}
