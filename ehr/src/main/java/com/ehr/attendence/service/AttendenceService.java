package com.ehr.attendence.service;

public interface AttendenceService {
	/**
	 * 批量删除考勤记录
	 * @param enumbers
	 */
	void delete(String[] enumbers);
}

