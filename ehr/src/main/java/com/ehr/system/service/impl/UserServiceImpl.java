package com.ehr.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrUserMapper;
import com.ehr.pojo.EhrUser;
import com.ehr.pojo.EhrUserExample;
import com.ehr.system.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	EhrUserMapper uMapper;
	
	@Override
	public List<EhrUser> queryAll() {
		EhrUserExample example = new EhrUserExample();
		return uMapper.selectByExample(example);
	}

	@Override
	public void delete(String[] ids) {
		EhrUserExample example = new EhrUserExample();
		List<Integer> list = new ArrayList<>();
		for (String str : ids) {
			list.add(Integer.parseInt(str));
		}
		example.createCriteria().andIdIn(list);
		uMapper.deleteByExample(example);
	}

}
