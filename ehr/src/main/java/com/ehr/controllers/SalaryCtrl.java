package com.ehr.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ehr.pojo.EhrAccounts;
import com.ehr.pojo.EhrPayRecord;
import com.ehr.pojo.ParamMapping;
import com.ehr.salary.service.SalaryAccountService;
import com.ehr.salary.service.SalaryPayRecordService;
import com.ehr.utils.EhrResult;

@Controller
@RequestMapping("/salary")
public class SalaryCtrl {
	
	@Autowired
	SalaryAccountService saService;
	
	@Autowired
	SalaryPayRecordService pService;
	
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
	
	@RequestMapping("/queryPayRecord")
	@ResponseBody
	public EhrResult queryPayRecord() {
		try {
			List<EhrPayRecord> list = pService.queryAll();
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@RequestMapping("/delAccounts/{paramstr}")
	@ResponseBody
	public EhrResult delAccounts(@PathVariable String paramstr) {
		try {
			String[] enumbers = paramstr.split(",");
			saService.delete(enumbers);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500,  ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@RequestMapping("/delPayRecords/{paramstr}")
	@ResponseBody
	public EhrResult delPayRecords(@PathVariable String paramstr) {
		try {
			String[] enumbers = paramstr.split(",");
			pService.delete(enumbers);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500,  ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@RequestMapping("/con_query_account")
	@ResponseBody
	public EhrResult con_query_account(String enumber,String ename,String type,Date starttime, Date endtime) {
		try {
			List<EhrAccounts> query = saService.conditionQuery(enumber, ename, type, starttime, endtime);
			return EhrResult.ok(query);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500,  ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@RequestMapping("/con_query_pay")
	@ResponseBody
	public EhrResult con_query_pay(String enumber,String ename,String type,Date starttime, Date endtime) {
		try {
			List<EhrPayRecord> query = pService.conditionQuery(enumber, ename, type, starttime, endtime);
			return EhrResult.ok(query);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500,  ParamMapping.UNKNOWN_ERROR);
		}
	}
}
