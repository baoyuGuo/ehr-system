package com.ehr.socialsecurity.service;

import java.util.List;

import com.ehr.pojo.EhrPayRecord;

public interface SSPayRecordService {
	List<EhrPayRecord> queryAll();
}
