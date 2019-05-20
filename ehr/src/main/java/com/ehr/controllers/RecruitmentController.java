package com.ehr.controllers;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import com.ehr.mapper.EhrRecruitmentPlanMapper;
import com.ehr.pojo.EhrRecruitmentPlan;
import com.ehr.pojo.ParamMapping;
import com.ehr.recruitment.service.ExaminationService;
import com.ehr.recruitment.service.PoolService;
import com.ehr.recruitment.service.RecruitmentPlanService;
import com.ehr.utils.EhrResult;

/**
 *    招聘模块Controller
 */
@Controller
@RequestMapping("/recruitment")
public class RecruitmentController {
	
	@Autowired
	EhrRecruitmentPlanMapper rpMapper;
	
	@Autowired
	RecruitmentPlanService rpService;
	
	@Autowired
	PoolService pService;
	
	@Autowired
	ExaminationService eService;
	
	@RequestMapping("/addRecruitmentPlan")
	public String addRecruitmentPlan(String start, String end,EhrRecruitmentPlan plan){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			plan.setStartdate(sdf.parse(start));
			plan.setEnddate(sdf.parse(end));
			rpMapper.insert(plan);
			return "success";
		} catch (ParseException e) {
			Logger logger = LoggerFactory.getLogger(RecruitmentController.class);
			logger.error("<添加招聘计划>未知的错误:" + e.getMessage());
			return "保存失败";
		}
	}
	
	@RequestMapping("/deletePlans/{str}")
	@ResponseBody
	public EhrResult deletePlans(@PathVariable String str) {
		try {
			String[] idstrs = str.split(",");
			rpService.delete(idstrs);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@RequestMapping("/delPool/{str}")
	@ResponseBody
	public EhrResult delPool(@PathVariable String str) {
		try {
			String[] idstrs = str.split(",");
			pService.delete(idstrs);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@RequestMapping("/delExamination/{str}")
	@ResponseBody
	public EhrResult delExamination(@PathVariable String str) {
		try {
			String[] idstrs = str.split(",");
			eService.delete(idstrs);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@ResponseBody
	@RequestMapping("/queryAll")
	public EhrResult queryAll() {
		try {
			return EhrResult.ok(rpService.queryAll());
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@ResponseBody
	@RequestMapping("/queryAllPool")
	public EhrResult queryAllPool() {
		try {
			return EhrResult.ok(pService.queryAll());
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@ResponseBody
	@RequestMapping("/queryAllExamination")
	public EhrResult queryAllExamination() {
		try {
			return EhrResult.ok(eService.queryAll());
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	
	@InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期 注意这里的转化要和传进来的字符串的格式一致
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }
}
