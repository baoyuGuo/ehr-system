package com.ehr.salary.service;

import java.util.Date;
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
	
	/**
	 * 条件查询
	 * @param enumber
	 * @param ename
	 * @param type
	 * @param starttime
	 * @param endtime
	 * @return
	 */
	List<EhrAccounts> conditionQuery(String enumber,String ename, String type, Date starttime, Date endtime );
}	
