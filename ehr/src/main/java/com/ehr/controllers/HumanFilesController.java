package com.ehr.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ehr.humanfiles.service.AdjustService;
import com.ehr.humanfiles.service.DimissionService;
import com.ehr.humanfiles.service.HumanFilesService;
import com.ehr.humanfiles.service.RewardPunishService;
import com.ehr.pojo.EhrAdjustment;
import com.ehr.pojo.EhrDimission;
import com.ehr.pojo.EhrEmployee;
import com.ehr.pojo.EhrEmployeeBaseInfo;
import com.ehr.pojo.EhrRewardPunish;
import com.ehr.pojo.EhrSalaryAccounts;
import com.ehr.pojo.ParamMapping;
import com.ehr.utils.EhrResult;
import com.ehr.utils.FileUploadUtil;

@Controller
@RequestMapping("/humanfiles")
public class HumanFilesController {
	
	@Autowired
	HumanFilesService hService;
	
	@Autowired
	DimissionService dService;
	
	@Autowired
	AdjustService aService;
	
	@Autowired
	RewardPunishService rpService;
	/**
	 * @param employee 员工信息
	 * @param baseInfo 员工个人的基本信息
	 * @param salaryInfo 员工薪资信息
	 * 完成员工的入职操作；
	 */
	@RequestMapping("/entry")
	public String entry(EhrEmployee employee,MultipartFile picture,MultipartFile uploadFile,EhrEmployeeBaseInfo baseInfo, EhrSalaryAccounts salaryInfo ) {
		Map<String, String> msg_map = new HashMap<>();
		//上传文件
		EhrResult res1 = FileUploadUtil.uploadPhoto(picture);
		if(res1.isOK()) {  
			//上传成功
			employee.setPhoto(res1.getData() + "");
		}
		
		EhrResult res2 = FileUploadUtil.uploadFile(uploadFile);
		if(res2.isOK()) {
			//上传成功
			employee.setEfileurl(res2.getData() + "");
		}
		employee.setEemail(baseInfo.getEmail());
		hService.entry(employee, picture, baseInfo, salaryInfo);
		return "h_entry";
	}
	
	@RequestMapping("/generateEnum")
	public void generateEnum() {
		//获取现有的工号，进行递增
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/queryEmployeeByEnumber")
	@ResponseBody
	public EhrResult queryEmployeeByEnumber(String enumber) {
		EhrEmployee employee = hService.queryEmployeeByEnumber(enumber);
		Map<String, Object> map = new HashMap<>();
		if(null != employee) {
			return EhrResult.ok(employee);
		}else {
			return EhrResult.build(5000, "请核对工号");
		}
	}
	
	@RequestMapping("/queryDimission")
	public ModelAndView queryEmployeeInfo(String enumber) {
		ModelAndView mv = new ModelAndView("h_dimission_info");
		//根据工号查询（该员工状态为离职）
		EhrEmployee employee = hService.queryEmployeeByEnumber(enumber);
		mv.addObject("employeeInfo", employee);
		return mv;
	}
	
	@RequestMapping("/queryDimissionRecords")
	@ResponseBody
	public EhrResult queryDimissionRecords() {
		try {
			List<EhrDimission> list = dService.queryAll();
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@ResponseBody
	@RequestMapping("/queryAdjustment/{title}")
	public EhrResult queryAdjustmentByTitle(@PathVariable String title) {
		try {
			List<EhrAdjustment> list = aService.queryByTitle(ParamMapping.ADJUST_TYPE.get(title));
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@RequestMapping("/queryRewardPunish")
	@ResponseBody
	public EhrResult queryRewardPunish() {
		try {
			List<EhrRewardPunish> list = rpService.queryAll();
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
}
