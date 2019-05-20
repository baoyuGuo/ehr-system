package com.ehr.humanfiles.service;

import java.util.Date;
import java.util.List;

import com.ehr.pojo.EhrRewardPunish;

public interface RewardPunishService {
	
	/**
	 * 查询所有的奖惩记录
	 * @return
	 */
	List<EhrRewardPunish> queryAll();
	
	/**
	 * 根据奖惩标题查询记录
	 * @param title
	 * @return
	 */
	List<EhrRewardPunish> queryByTitle(String title);
	
	/**
	 * 批量删除奖惩记录
	 * @param enumbers
	 */
	void delete(String[] enumbers);
	
	/** 
	 * 条件查询奖惩记录
	 * @param enumber
	 * @param ename
	 * @param title
	 * @param type
	 * @param starttime
	 * @param endtime
	 * @return
	 */
	List<EhrRewardPunish> conditionQuery( String enumber,  String ename, String title,  String type, Date starttime, Date endtime);
}
