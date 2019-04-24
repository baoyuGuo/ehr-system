package com.ehr.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ehr.pojo.SystemModules;

@Controller
public class LoginController {

	@Autowired
	private SystemModules systemModules;

	/*
	 * 	进行登陆；
	 * 	登陆成功跳转至首页并初始化左边导航栏
	 * */
	@RequestMapping("/login")
	public String login() {
		return "redirect:/createLeft/humanfiles"; 
	}
}
