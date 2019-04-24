package com.ehr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ehr.pojo.EhrAccounts;
import com.ehr.pojo.ParamMapping;
import com.ehr.salary.service.SalaryAccountService;
import com.ehr.utils.EhrResult;

@Controller
@RequestMapping("/salary")
public class SalaryCtrl {
	
	@Autowired
	SalaryAccountService saService;
	
	@RequestMapping("/queryAccounts")
	@ResponseBody
	public EhrResult queryAccounts() {
		try {
			List<EhrAccounts> list = saService.queryAll();
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
}
