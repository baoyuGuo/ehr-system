package com.ehr.socialsecurity.service;

import java.util.List;

import com.ehr.pojo.EhrSsType;

public interface SSTypeService {
	/**
	 * 查询所有的社保类型
	 * @return
	 */
	List<EhrSsType> queryAll();
	
	/**
	 * 批量删除
	 * @param ids
	 */
	void delete(String[] ids);
}
