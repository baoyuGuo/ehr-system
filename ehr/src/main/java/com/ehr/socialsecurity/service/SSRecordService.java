package com.ehr.socialsecurity.service;

import java.util.List;

import com.ehr.pojo.EhrSsRecords;

public interface SSRecordService {
	List<EhrSsRecords> queryAll();
}
