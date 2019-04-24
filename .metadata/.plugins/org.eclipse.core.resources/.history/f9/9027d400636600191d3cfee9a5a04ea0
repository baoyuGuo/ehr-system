package com.ehr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ehr.department.service.DepartmentService;
import com.ehr.pojo.EhrDepartment;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	
//	@Reference
	@Autowired
	DepartmentService service;
	
	@RequestMapping("/tree")
	@ResponseBody
	public List<EhrDepartment> departmentStructureDiv(@RequestParam(required=false) Integer id) {
		if(null==id)
		{
			id=0;
		}
		List<EhrDepartment> list = service.queryDepartment(id);
		return list;
	}
}
