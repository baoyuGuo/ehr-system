package com.ehr.portal.service.impl;

import static org.hamcrest.CoreMatchers.endsWith;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.ehr.mapper.EhrUserMapper;
import com.ehr.pojo.EhrUser;
import com.ehr.pojo.EhrUserExample;
import com.ehr.pojo.ParamMapping;
import com.ehr.pojo.RegisterForm;
import com.ehr.portal.service.RegisterService;
import com.ehr.utils.EhrResult;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	EhrUserMapper uMapper;
	
	@Override
	public void register(EhrUser user) {
		uMapper.insert(user);
	}

	@Override
	public EhrResult checkData(RegisterForm register) {
		EhrUser user = new EhrUser();
		String email = register.getEmail();
		int index = email.indexOf("@");
		user.setEnumber(email.substring(0,index));
		user.setPassword(DigestUtils.md5DigestAsHex(register.getPassword().getBytes()));
		EhrUserExample exam = new EhrUserExample();
		exam.createCriteria().andEnumberEqualTo(user.getEnumber());
		List<EhrUser> list = uMapper.selectByExample(exam);
		if(!list.isEmpty()) {
			return EhrResult.build(500,ParamMapping.EXIST_USER);
		}else {
			return EhrResult.ok(user);
		}
	}

}
