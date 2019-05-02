package com.ehr.humanfiles.service;

import java.util.List;

import com.ehr.pojo.EhrAdjustment;

public interface AdjustService {
	/**
	 * 查询所有调整记录
	 * @return
	 */
	List<EhrAdjustment> queryAll();
	
	/**
	 * 根据调动标题查询调动记录
	 * @param title
	 * @return
	 */
	List<EhrAdjustment> queryByTitle(String title);
	
	/**
	 * 根据调动类型查询记录
	 * @param type
	 * @return List<EhrAdjustment>
	 */
	List<EhrAdjustment> queryByType(String type);
	
	/**
	 * 批量删除调整记录
	 * @param params  
	 */
	void delete(String[] params);
}
