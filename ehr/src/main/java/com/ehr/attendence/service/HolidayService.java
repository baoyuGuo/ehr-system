package com.ehr.attendence.service;

public interface HolidayService {
	
	/**
	 * 批量删除休假记录
	 * @param enumbers
	 */
	void delete(String[] enumbers);
}
