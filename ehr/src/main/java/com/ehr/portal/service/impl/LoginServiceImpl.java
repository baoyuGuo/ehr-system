package com.ehr.portal.service.impl;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.ehr.mapper.EhrUserMapper;
import com.ehr.pojo.EhrUser;
import com.ehr.pojo.EhrUserExample;
import com.ehr.pojo.ParamMapping;
import com.ehr.portal.service.LoginService;
import com.ehr.utils.EhrResult;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	EhrUserMapper uMapper;
	
	@Override
	public EhrResult login(EhrUser user,HttpServletResponse response) {
		EhrResult check = checkData(user);
		if(!check.isOK()) {
			return check;
		}
		EhrUser u = (EhrUser) check.getData();
		Cookie c1 = new Cookie("username", u.getEnumber());
		Cookie c2 = new Cookie("password", u.getPassword());
		c1.setMaxAge(60*60*24);
		c2.setMaxAge(60*60*24);
		response.addCookie(c1);
		response.addCookie(c2);
		return EhrResult.ok(u);
	}

	@Override
	public EhrResult checkData(EhrUser user) {
		if(user==null || user.getEnumber()==null || user.getPassword()==null) {
			return EhrResult.build(400, ParamMapping.EMPTY_USER);
		}
		//校验数据
		EhrUserExample exam = new EhrUserExample();
		exam.createCriteria().andEnumberEqualTo(user.getEnumber());
		List<EhrUser> list = uMapper.selectByExample(exam);
		if(list.isEmpty()) {
			return EhrResult.build(400,ParamMapping.UNEXIST_USER);
		}else {
			EhrUser res = list.get(0);
			String encode = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
			if(!res.getPassword().equals(encode)) {
				return EhrResult.build(400, ParamMapping.ERROR_USER);
			}
			return EhrResult.ok(list.get(0));
		}
	}

}
