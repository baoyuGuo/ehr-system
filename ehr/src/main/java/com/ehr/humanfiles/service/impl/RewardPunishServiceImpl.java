package com.ehr.humanfiles.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.humanfiles.service.RewardPunishService;
import com.ehr.mapper.EhrRewardPunishMapper;
import com.ehr.pojo.EhrRewardPunish;
import com.ehr.pojo.EhrRewardPunishExample;
import com.ehr.pojo.EhrRewardPunishExample.Criteria;

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

	@Override
	public void delete(String[] enumbers) {
		for (String enumber : enumbers) {
			rpMapper.deleteByPrimaryKey(enumber);
		}
	}

	@Override
	public List<EhrRewardPunish> conditionQuery(String enumber, String ename, String title, String type, Date starttime,
			Date endtime) {
		EhrRewardPunishExample exam = new EhrRewardPunishExample();
		Criteria criteria = exam.createCriteria();
		if(enumber.length()!=0) {
			criteria.andEnumberEqualTo(enumber);
		}
		if(ename.length()!=0) {
			criteria.andEnameEqualTo(ename);
		}
		if(title.length()!=0) {
			criteria.andTitleEqualTo(title);
		}
		if(type.length()!=0) {
			criteria.andTypeEqualTo(type);
		}
		//起始时间
		if(starttime!=null && endtime!=null) {
			//String字符串转化为Date
			criteria.andTimeBetween(starttime, endtime);
		}else {
			if(starttime!=null) {  
				//只有起始时间
				criteria.andTimeGreaterThanOrEqualTo(starttime);
			}else if(endtime != null) {
				//只有截止时间
				criteria.andTimeLessThanOrEqualTo(endtime);
			}
		}
		return rpMapper.selectByExample(exam);
	}

}
