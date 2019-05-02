package com.ehr.socialsecurity.service;

import java.util.List;

import com.ehr.pojo.EhrPayRecord;

public interface SSPayRecordService {
	/**
	 * 查询所有的社保福利支付记录
	 * @return
	 */
	List<EhrPayRecord> queryAll();
	
	/**
	 * 批量删除社保缴纳记录
	 * @param enumbers
	 */
	void delete(String[] enumbers);
}
