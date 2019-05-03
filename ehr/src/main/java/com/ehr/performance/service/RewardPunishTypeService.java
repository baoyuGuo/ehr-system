package com.ehr.performance.service;

import java.util.List;

import com.ehr.pojo.EhrRpType;

public interface RewardPunishTypeService {
	
	/**
	 * 查询所有的奖惩类型
	 * @return
	 */
	List<EhrRpType> queryAll();
	
	/**
	 * 批量删除奖惩项目
	 * @param ids
	 */
	void delete(String[] ids);
}
