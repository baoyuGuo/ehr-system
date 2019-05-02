package com.ehr.socialsecurity.service;

import java.util.List;

import com.ehr.pojo.EhrSsRecords;

/**
 * 员工社保
 * @author 12866
 *
 */
public interface SSRecordService {
	/**
	 * 查询所有员工投保记录
	 * @return
	 */
	List<EhrSsRecords> queryAll();
	
	/**
	 * 批量删除员工投保记录
	 * @param enumbers
	 */
	void delete(String[] enumbers);
}
