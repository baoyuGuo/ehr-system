package com.ehr.attendence.service;

public interface BusinessService {
	/**
	 * 批量删除出差记录
	 * @param enumbers
	 */
	void delete(String[] enumbers);
}
