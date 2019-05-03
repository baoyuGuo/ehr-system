package com.ehr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ehr.performance.service.PerformanceService;
import com.ehr.performance.service.RewardPunishTypeService;
import com.ehr.pojo.EhrPerformance;
import com.ehr.pojo.EhrRpType;
import com.ehr.pojo.ParamMapping;
import com.ehr.utils.EhrResult;

@Controller
@RequestMapping("/performance")
public class PerformanceCtrl {
	
	@Autowired
	PerformanceService pService;
	
	@Autowired
	RewardPunishTypeService rptService;
	
	@RequestMapping("/queryPerformanceRecords")
	@ResponseBody
	public EhrResult queryPerformanceRecords() {
		try {
			List<EhrPerformance> list = pService.queryAll();
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@RequestMapping("/delRecords/{param}")
	@ResponseBody
	public EhrResult deleteRecords(@PathVariable String param) {
		try {
			String[] ids = param.split(",");
			pService.delete(ids);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@RequestMapping("/delType/{param}")
	@ResponseBody
	public EhrResult delType(@PathVariable String param) {
		try {
			String[] ids = param.split(",");
			rptService.delete(ids);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@ResponseBody
	@RequestMapping("/queryAllRpType")
	public EhrResult queryAllRpType() {
		try {
			List<EhrRpType> list = rptService.queryAll();
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
}
