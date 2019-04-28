package com.ehr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ehr.mapper.EhrAttendenceMapper;
import com.ehr.mapper.EhrEmployeeMapper;
import com.ehr.mapper.EhrOnbusinessMapper;
import com.ehr.mapper.EhrOnholidayMapper;
import com.ehr.mapper.EhrOvertimeMapper;
import com.ehr.pojo.EhrAttendence;
import com.ehr.pojo.EhrAttendenceExample;
import com.ehr.pojo.EhrEmployee;
import com.ehr.pojo.EhrEmployeeExample;
import com.ehr.pojo.EhrOnbusiness;
import com.ehr.pojo.EhrOnbusinessExample;
import com.ehr.pojo.EhrOnholiday;
import com.ehr.pojo.EhrOnholidayExample;
import com.ehr.pojo.EhrOvertime;
import com.ehr.pojo.EhrOvertimeExample;
import com.ehr.utils.EhrResult;

@Controller
@RequestMapping("/attendence")
public class AttendenceController {
	
	@Autowired
	EhrEmployeeMapper eMapper;
	
	@Autowired
	EhrAttendenceMapper aMapper;
	
	@Autowired
	EhrOnbusinessMapper businessMapper;
	
	@Autowired
	EhrOnholidayMapper holidayMapper;
	
	@Autowired
	EhrOvertimeMapper overtimeMapper;
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public EhrResult queryAllRecords() {
		EhrAttendenceExample example = new EhrAttendenceExample();
		List<EhrAttendence> list = aMapper.selectByExample(example);
		return EhrResult.ok(list);
	}
	
	@RequestMapping("/queryOnBusiness")
	@ResponseBody
	public EhrResult queryOnBusiness() {
		EhrOnbusinessExample example = new EhrOnbusinessExample();
		List<EhrOnbusiness> list = businessMapper.selectByExample(example);
		return EhrResult.ok(list);
	}
	
	@RequestMapping("/queryOnHoliday")
	@ResponseBody
	public EhrResult queryOnHoliday() {
		EhrOnholidayExample example = new EhrOnholidayExample();
		List<EhrOnholiday> list = holidayMapper.selectByExample(example);
		return EhrResult.ok(list);
	}
	
	@ResponseBody
	@RequestMapping("/queryOnOvertime")
	public EhrResult queryOnOvertime() {
		EhrOvertimeExample example = new EhrOvertimeExample();
		List<EhrOvertime> list = overtimeMapper.selectByExample(example);
		return EhrResult.ok(list);
	}
	
}
