package com.ehr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ehr.attendence.service.AttendenceService;
import com.ehr.attendence.service.BusinessService;
import com.ehr.attendence.service.HolidayService;
import com.ehr.attendence.service.OvertimeService;
import com.ehr.mapper.EhrAttendenceMapper;
import com.ehr.mapper.EhrEmployeeMapper;
import com.ehr.mapper.EhrOnbusinessMapper;
import com.ehr.mapper.EhrOnholidayMapper;
import com.ehr.mapper.EhrOvertimeMapper;
import com.ehr.pojo.EhrAttendence;
import com.ehr.pojo.EhrAttendenceExample;
import com.ehr.pojo.EhrOnbusiness;
import com.ehr.pojo.EhrOnbusinessExample;
import com.ehr.pojo.EhrOnholiday;
import com.ehr.pojo.EhrOnholidayExample;
import com.ehr.pojo.EhrOvertime;
import com.ehr.pojo.EhrOvertimeExample;
import com.ehr.pojo.ParamMapping;
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
	
	@Autowired
	AttendenceService aService;
	
	@Autowired
	BusinessService bService;
	
	@Autowired
	HolidayService hService;
	
	@Autowired
	OvertimeService oService;
	
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
	
	@RequestMapping("/delAttendence/{paramstr}")
	@ResponseBody
	public EhrResult deleteRecord(@PathVariable String paramstr) {
		try {
			String[] ids = paramstr.split(",");
			aService.delete(ids);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@ResponseBody
	@RequestMapping("/delOnBusiness/{params}")
	public EhrResult delOnBusiness(@PathVariable String params) {
		try {
			String[] ids = params.split(",");
			bService.delete(ids);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@ResponseBody
	@RequestMapping("/delOnHoliday/{params}")
	public EhrResult delOnHoliday(@PathVariable String params) {
		try {
			String[] ids = params.split(",");
			hService.delete(ids);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@ResponseBody
	@RequestMapping("/delOvertime/{params}")
	public EhrResult delOvertime(@PathVariable String params) {
		try {
			String[] ids = params.split(",");
			oService.delete(ids);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
}
