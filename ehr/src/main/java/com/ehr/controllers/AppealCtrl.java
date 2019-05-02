package com.ehr.controllers;

import java.util.List;

import org.apache.ibatis.binding.MapperMethod.ParamMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ehr.appeal.service.AppealService;
import com.ehr.pojo.EhrAppeal;
import com.ehr.pojo.ParamMapping;
import com.ehr.utils.EhrResult;

@Controller
@RequestMapping("/appeal")
public class AppealCtrl {
	
	@Autowired
	AppealService appealService;
	
	@ResponseBody
	@RequestMapping("/queryAll")
	public EhrResult queryAll() {
		try {
			List<EhrAppeal> list = appealService.queryAll();
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@RequestMapping("/delete/{paramstr}")
	@ResponseBody
	public EhrResult delete(@PathVariable String paramstr) {
		try {
			String[] params = paramstr.split(",");
			appealService.delete(params);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
}
