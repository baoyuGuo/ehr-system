package com.ehr.humanfiles.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ehr.exception.UploadFileException;
import com.ehr.humanfiles.service.HumanFilesService;
import com.ehr.mapper.EhrEmployeeBaseInfoMapper;
import com.ehr.mapper.EhrEmployeeMapper;
import com.ehr.mapper.EhrSalaryAccountsMapper;
import com.ehr.pojo.EhrDimission;
import com.ehr.pojo.EhrEmployee;
import com.ehr.pojo.EhrEmployeeBaseInfo;
import com.ehr.pojo.EhrSalaryAccounts;
import com.ehr.pojo.ParamMapping;
import com.ehr.utils.EhrResult;
import com.ehr.utils.FileUploadUtil;

@Service
public class HumanfilesServiceImpl  implements HumanFilesService{
	
	@Autowired
	EhrEmployeeMapper employeeMapper ;
	
	@Autowired
	EhrEmployeeBaseInfoMapper baseInfoMapper;
	
	@Autowired
	EhrSalaryAccountsMapper salaryMapper;
	
	@Override
	public void entry(EhrEmployee employee, MultipartFile picture,MultipartFile uploadFile,
			EhrEmployeeBaseInfo baseInfo, EhrSalaryAccounts salaryInfo) throws UploadFileException {
		//上传照片
		if(picture != null){
			EhrResult res1 = FileUploadUtil.uploadPhoto(picture);
			if(res1.isOK()) {
				employee.setPhoto(res1.getData().toString());
			}else {
				throw new UploadFileException(ParamMapping.UPLOAD_FILE_FAILED);
			}
		}
		//上传附件
		if(uploadFile != null) {
			EhrResult res2 = FileUploadUtil.uploadFile(uploadFile);
			if(res2.isOK()) {
				employee.setEfileurl(res2.getData().toString());
			}else {
				throw new UploadFileException(ParamMapping.UPLOAD_FILE_FAILED);
			}
		}
		//公司内部邮箱
		employee.setEemail(employee.getEnumber()+"@xxx.com");
		//插入数据
		employeeMapper.insert(employee);
		baseInfoMapper.insert(baseInfo);
		salaryMapper.insert(salaryInfo);
	}

	@Override
	public EhrResult dimission_add(EhrDimission dimission) {
		//添加离职信息
		return null;
	}

	@Override
	public EhrEmployee queryEmployeeByEnumber(String enumber) {
		return employeeMapper.selectByPrimaryKey(enumber);
	}


}
