package com.ehr.humanfiles.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.humanfiles.service.RewardPunishService;
import com.ehr.mapper.EhrRewardPunishMapper;
import com.ehr.pojo.EhrRecruitmentPlanExample;
import com.ehr.pojo.EhrRewardPunish;
import com.ehr.pojo.EhrRewardPunishExample;

@Service
public class RewardPunishServiceImpl implements RewardPunishService {

	@Autowired
	EhrRewardPunishMapper rpMapper;
	
	@Override
	public List<EhrRewardPunish> queryAll() {
		EhrRewardPunishExample exam = new EhrRewardPunishExample();
		return rpMapper.selectByExample(exam);
	}

	@Override
	public List<EhrRewardPunish> queryByTitle(String title) {
		// TODO 根据title(奖励、惩处)查询奖惩记录
		EhrRewardPunishExample exam = new EhrRewardPunishExample();
		exam .createCriteria().andTitleEqualTo(title);
		return rpMapper.selectByExample(exam);
	}

}
