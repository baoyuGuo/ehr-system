package com.ehr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ehr.common.service.QueryEmpService;
import com.ehr.pojo.EhrEmployee;
import com.ehr.pojo.ParamMapping;

@Controller
@RequestMapping("/common")
public class CommonCtrl {
	
	@Autowired
	QueryEmpService qeService;
	
	/**
	 * @param ename
	 * @return
	 * 选择员工页-查询员工信息
	 */
	@RequestMapping("/queryEmpByName")
	public ModelAndView queryEmpByName(String ename) {
		ModelAndView mv = new ModelAndView();
		try {
			List<EhrEmployee> list = qeService.queryEmpByName(ename);
			if(list==null || list.isEmpty()) {
				mv.addObject("failed", ParamMapping.NO_RECORDS);
			}else {
				mv.addObject("employInfo",list);
			}
			mv.setViewName("select_employee");
			return mv;
		} catch (Exception e) {
			e.printStackTrace();
		    mv.setViewName("error");
		    mv.addObject("failed", e.getMessage());
		}
		return mv;
	}
	
	
}
