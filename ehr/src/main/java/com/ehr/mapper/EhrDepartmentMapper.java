package com.ehr.mapper;

import com.ehr.pojo.EhrDepartment;
import com.ehr.pojo.EhrDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrDepartmentMapper {
    int countByExample(EhrDepartmentExample example);

    int deleteByExample(EhrDepartmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EhrDepartment record);

    int insertSelective(EhrDepartment record);

    List<EhrDepartment> selectByExample(EhrDepartmentExample example);

    EhrDepartment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EhrDepartment record, @Param("example") EhrDepartmentExample example);

    int updateByExample(@Param("record") EhrDepartment record, @Param("example") EhrDepartmentExample example);

    int updateByPrimaryKeySelective(EhrDepartment record);

    int updateByPrimaryKey(EhrDepartment record);

	List<EhrDepartment> selectChildById(Integer id);
}