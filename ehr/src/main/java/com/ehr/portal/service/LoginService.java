package com.ehr.portal.service;

import javax.servlet.http.HttpServletResponse;

import com.ehr.pojo.EhrUser;
import com.ehr.utils.EhrResult;

public interface LoginService {
	EhrResult login(EhrUser user,HttpServletResponse response);
	
	EhrResult checkData(EhrUser user);
}
