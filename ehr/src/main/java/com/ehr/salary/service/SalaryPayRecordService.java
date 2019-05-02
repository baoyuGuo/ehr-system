package com.ehr.salary.service;

import java.util.List;

import com.ehr.pojo.EhrPayRecord;

public interface SalaryPayRecordService {
	
	/**
	 * 查询所有薪资发放记录
	 * @return
	 */
	List<EhrPayRecord> queryAll();
	
	/**
	 * 批量删除员工薪资发放记录
	 * @param enumbers
	 */
	void delete(String[] enumbers);
}
