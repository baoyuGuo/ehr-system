package com.ehr.mapper;

import com.ehr.pojo.EhrTest;
import com.ehr.pojo.EhrTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrTestMapper {
    int countByExample(EhrTestExample example);

    int deleteByExample(EhrTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EhrTest record);

    int insertSelective(EhrTest record);

    List<EhrTest> selectByExample(EhrTestExample example);

    EhrTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EhrTest record, @Param("example") EhrTestExample example);

    int updateByExample(@Param("record") EhrTest record, @Param("example") EhrTestExample example);

    int updateByPrimaryKeySelective(EhrTest record);

    int updateByPrimaryKey(EhrTest record);
}