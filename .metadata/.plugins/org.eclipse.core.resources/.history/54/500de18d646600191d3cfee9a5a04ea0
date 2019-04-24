package com.ehr.mapper;

import com.ehr.pojo.EhrEmployee;
import com.ehr.pojo.EhrEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrEmployeeMapper {
    int countByExample(EhrEmployeeExample example);

    int deleteByExample(EhrEmployeeExample example);

    int deleteByPrimaryKey(String enumber);

    int insert(EhrEmployee record);

    int insertSelective(EhrEmployee record);

    List<EhrEmployee> selectByExample(EhrEmployeeExample example);

    EhrEmployee selectByPrimaryKey(String enumber);

    int updateByExampleSelective(@Param("record") EhrEmployee record, @Param("example") EhrEmployeeExample example);

    int updateByExample(@Param("record") EhrEmployee record, @Param("example") EhrEmployeeExample example);

    int updateByPrimaryKeySelective(EhrEmployee record);

    int updateByPrimaryKey(EhrEmployee record);
}