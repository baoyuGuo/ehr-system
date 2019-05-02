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

import com.ehr.exception.UploadFileException;
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
	 * @param param
	 * @return
	 * 批量删除离职记录
	 */
	@RequestMapping(value="/delDimission/{paramstr}",method=RequestMethod.GET)
	@ResponseBody
	public EhrResult delDimission(@PathVariable String paramstr) {
		//前端已经进行校验，param长度大于0
		try {
			String[] enumbers = paramstr.split(",");
			dService.delete(enumbers);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.DO_FAILED );
		}
	}
	
	
	/**
	 * @param employee 员工信息
	 * @param baseInfo 员工个人的基本信息
	 * @param salaryInfo 员工薪资信息
	 * 完成员工的入职操作；
	 */
	@RequestMapping("/entry")
	public ModelAndView entry(EhrEmployee employee,MultipartFile picture,MultipartFile uploadFile,EhrEmployeeBaseInfo baseInfo, EhrSalaryAccounts salaryInfo ) {
		ModelAndView mv = new ModelAndView("success");
		try {
			hService.entry(employee, picture, uploadFile, baseInfo, salaryInfo);
			mv.addObject("success", ParamMapping.DO_SUCCESS);
		} catch (UploadFileException e) {
			mv.addObject("failed", ParamMapping.DO_FAILED +":" +  e.getMessage());
			mv.setViewName("error");
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("/generateEnum")
	public void generateEnum() {
		//获取现有的工号，进行递增
	}
	
	/**
	 * @param enumber
	 * @return
	 * 根据员工工号查询员工
	 */
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
	
	/**
	 * @param enumber
	 * @return
	 * 查询离职记录
	 */
	@RequestMapping("/queryDimission")
	public ModelAndView queryEmployeeInfo(String enumber) {
		ModelAndView mv = new ModelAndView("h_dimission_info");
		//根据工号查询（该员工状态为离职）
		EhrEmployee employee = hService.queryEmployeeByEnumber(enumber);
		mv.addObject("employeeInfo", employee);
		return mv;
	}
	
	/**
	 * @return
	 * 查询所有离职记录
	 */
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
	
	/**
	 * 根据title查询调动
	 * @param title
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/queryAdjustment/{title}")
	public EhrResult queryAdjustmentByTitle(@PathVariable String title) {
		try {
			List<EhrAdjustment> list = aService.queryByTitle(ParamMapping.ADJUST_TITLE.get(title));
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	/**
	 * 根据type查询调动
	 * @param type
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/queryAdjustmentByType/{type}")
	public EhrResult queryAdjustmentByType(@PathVariable String type) {
		try {
			List<EhrAdjustment> list = aService.queryByType(type);
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	/**
	 * 查询所有奖惩记录
	 * @return
	 */
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
	
	/**
	 * 新增离职记录
	 * @param dimission
	 * @param uploadFile
	 * @return
	 */
	@RequestMapping("/addDimission")
	public ModelAndView addDimission(EhrDimission dimission,MultipartFile uploadFile) {
		ModelAndView mv = new ModelAndView("error");
		try {
			if(!uploadFile.isEmpty()) {
				EhrResult result = FileUploadUtil.uploadFile(uploadFile);
				if(result.isOK()) {
					dimission.setFilepath(result.getData().toString());
				}else {
					mv.addObject("failed", result.getMsg());
					return mv;
				}
			}
			dService.add(dimission);
			mv.setViewName("success");
		} catch (Exception e) {
			e.printStackTrace();
			mv.addObject("failed", ParamMapping.UNKNOWN_ERROR);
		}
		return mv;
	}
	
	/**
	 * 批量删除调岗记录
	 * @param param
	 * @return
	 */
	@RequestMapping(value="/delAdjustment/{paramstr}",method=RequestMethod.GET)
	@ResponseBody
	public EhrResult delReassignment(@PathVariable String paramstr) {
		//前端已经进行校验，param长度大于0
		try {
			String[] enumbers = paramstr.split(",");
			aService.delete(enumbers);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.DO_FAILED );
		}
	}
	
	/**
	 * 批量删除所选中的奖惩记录
	 * @param paramstr
	 * @return
	 */
	@RequestMapping(value="/delRewardPunish/{paramstr}",method=RequestMethod.GET)
	@ResponseBody
	public EhrResult delRewardPunish(@PathVariable String paramstr) {
		//前端已经进行校验，param长度大于0
		try {
			String[] enumbers = paramstr.split(",");
			rpService.delete(enumbers);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.DO_FAILED );
		}
	}	
}
