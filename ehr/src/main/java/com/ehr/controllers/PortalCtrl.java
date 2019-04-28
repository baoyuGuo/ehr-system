package com.ehr.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.binding.MapperMethod.ParamMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ehr.pojo.EhrUser;
import com.ehr.pojo.ParamMapping;
import com.ehr.pojo.RegisterForm;
import com.ehr.portal.service.LoginService;
import com.ehr.portal.service.RegisterService;
import com.ehr.utils.EhrResult;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.Param;

@Controller
@RequestMapping("/portal")
public class PortalCtrl {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	RegisterService registerService;

	@RequestMapping("/login")
	public ModelAndView login(EhrUser user,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("index");
		try {
			EhrResult result = loginService.login(user, response);
			if (!result.isOK()) {
				mv.addObject("login_failed", result.getMsg());
			}else {
				mv.setViewName("redirect:/createLeft/humanfiles");
			}
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("login_failed", ParamMapping.UNKNOWN_ERROR);
		}
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(@Validated RegisterForm register,BindingResult result) {
		ModelAndView mv = new ModelAndView("register");
		List<String> msg = new ArrayList<String>();
		if(result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			for (ObjectError objectError : errors) {
				msg.add(objectError.getDefaultMessage());
			}
			mv.addObject("register_failed", msg);
		}else {
			EhrResult checkData = registerService.checkData(register);
			if(!checkData.isOK()) {
				mv.addObject("register_failed", checkData.getMsg());
			}else {
				try {
					registerService.register((EhrUser) checkData.getData());
					//注册成功
					mv.setViewName("index");
					mv.addObject("reg_success", ParamMapping.REG_SUCCESS);
				} catch (Exception e) {
					e.printStackTrace();
					mv.addObject("register_failed", msg.add(ParamMapping.UNKNOWN_ERROR));
				}
			}
		}
		return mv;
	}
}
