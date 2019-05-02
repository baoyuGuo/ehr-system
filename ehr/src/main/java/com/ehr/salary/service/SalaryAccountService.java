package com.ehr.salary.service;

import java.util.List;

import com.ehr.pojo.EhrAccounts;

public interface SalaryAccountService {
	
	/**
	 * 查询所有薪资账户
	 * @return
	 */
	List<EhrAccounts> queryAll();
	
	/**
	 * 批量删除账户
	 * @param enumbers
	 */
	void delete(String[] enumbers);
}	
