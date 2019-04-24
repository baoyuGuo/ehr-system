package com.ehr.portal.service;

import com.ehr.pojo.EhrUser;
import com.ehr.pojo.RegisterForm;
import com.ehr.utils.EhrResult;

public interface RegisterService {
	void register(EhrUser user);
	
	EhrResult checkData(RegisterForm register);
}
