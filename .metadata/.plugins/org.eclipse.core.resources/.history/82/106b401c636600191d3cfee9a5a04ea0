package com.ehr.humanfiles.service;

import org.springframework.web.multipart.MultipartFile;

import com.ehr.pojo.EhrDimission;
import com.ehr.pojo.EhrEmployee;
import com.ehr.pojo.EhrEmployeeBaseInfo;
import com.ehr.pojo.EhrSalaryAccounts;
import com.ehr.utils.EhrResult;

public interface HumanFilesService {
	public EhrResult entry(EhrEmployee employee,MultipartFile picture,EhrEmployeeBaseInfo baseInfo, EhrSalaryAccounts salaryInfo );
	public EhrResult dimission_add(EhrDimission dimission);
	public EhrEmployee queryEmployeeByEnumber(String enumber);
}
