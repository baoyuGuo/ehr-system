package com.ehr.humanfiles.service;

import java.util.List;

import com.ehr.pojo.EhrRewardPunish;

public interface RewardPunishService {
	
	List<EhrRewardPunish> queryAll();
	
	List<EhrRewardPunish> queryByTitle(String title);
}
