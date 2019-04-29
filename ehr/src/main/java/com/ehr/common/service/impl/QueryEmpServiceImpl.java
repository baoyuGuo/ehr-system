package com.ehr.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.common.service.QueryEmpService;
import com.ehr.mapper.EhrDepartmentMapper;
import com.ehr.mapper.EhrEmployeeMapper;
import com.ehr.pojo.EhrDepartment;
import com.ehr.pojo.EhrDepartmentExample;
import com.ehr.pojo.EhrEmployee;
import com.ehr.pojo.EhrEmployeeExample;

@Service
public class QueryEmpServiceImpl implements QueryEmpService {


	@Autowired
	EhrDepartmentMapper dMapper;
	
	@Autowired
	EhrEmployeeMapper employeeMapper;
	
	@Override
	public List<EhrEmployee> queryEmpByName(String ename) {
		EhrEmployeeExample exam = new EhrEmployeeExample();
		exam.createCriteria().andEnameLike(ename);
		List<EhrEmployee> list = employeeMapper.selectByExample(exam);
		//替换其中的数据
		if (list.size()>0) {
			formatEmps(list);
		}
		return list;
	}

	public void formatEmps(List<EhrEmployee> list){
		for (EhrEmployee emp : list) {
			String dnum = emp.getEdepartmentnum();
			//解析部门
			EhrDepartmentExample exam = new EhrDepartmentExample();
			exam.createCriteria().andCodeEqualTo(dnum);
			List<EhrDepartment> res = dMapper.selectByExample(exam);
			String text = res.get(0).getText();
			emp.setEdepartmentnum(text);
			//解析岗位
			exam.clear();
			exam.createCriteria().andCodeEqualTo(emp.getEpost());
			String pstr = dMapper.selectByExample(exam).get(0).getText();
			emp.setEpost(pstr);
		}
	}

}
