package com.ehr.mapper;

import com.ehr.pojo.EhrPool;
import com.ehr.pojo.EhrPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrPoolMapper {
    int countByExample(EhrPoolExample example);

    int deleteByExample(EhrPoolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EhrPool record);

    int insertSelective(EhrPool record);

    List<EhrPool> selectByExample(EhrPoolExample example);

    EhrPool selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EhrPool record, @Param("example") EhrPoolExample example);

    int updateByExample(@Param("record") EhrPool record, @Param("example") EhrPoolExample example);

    int updateByPrimaryKeySelective(EhrPool record);

    int updateByPrimaryKey(EhrPool record);
}