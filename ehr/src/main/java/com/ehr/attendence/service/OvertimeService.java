package com.ehr.attendence.service;

public interface OvertimeService {
	
	/**
	 * 批量删除加班记录
	 * @param enumbers
	 */
	void delete(String[] enumbers);
}
