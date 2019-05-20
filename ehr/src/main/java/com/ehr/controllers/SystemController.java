package com.ehr.controllers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertFalse;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.DateUtils;

import com.ehr.pojo.EhrDimission;
import com.ehr.pojo.EhrDimissionExample;
import com.ehr.pojo.EhrDimissionExample.Criteria;
import com.ehr.pojo.ParamMapping;
import com.ehr.system.service.UserService;
import com.ehr.utils.EhrResult;

@Controller
@RequestMapping("/system")
public class SystemController {

	@Autowired
	UserService uService;

	
	@RequestMapping("/queryAllUser")
	@ResponseBody
	public EhrResult queryAllUser() {
		try {
			return EhrResult.ok(uService.queryAll());
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@ResponseBody
	@RequestMapping("/delUser/{param}")
	public EhrResult delUser(@PathVariable String param) {
		try {
			String[] ids = param.split(",");
			uService.delete(ids);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
}
