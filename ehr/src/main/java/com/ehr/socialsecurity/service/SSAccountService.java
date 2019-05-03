package com.ehr.socialsecurity.service;

import java.util.List;

import com.ehr.pojo.EhrAccounts;

public interface SSAccountService {
	
	/**
	 * 查询所有社保账户
	 * @return
	 */
	List<EhrAccounts> queryAll();

	/**
	 * 批量删除社保账户
	 * @param ids
	 */
	void delete(String[] ids);
}
