package com.ehr.mapper;

import com.ehr.pojo.EhrPerformance;
import com.ehr.pojo.EhrPerformanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrPerformanceMapper {
    int countByExample(EhrPerformanceExample example);

    int deleteByExample(EhrPerformanceExample example);

    int deleteByPrimaryKey(String enumber);

    int insert(EhrPerformance record);

    int insertSelective(EhrPerformance record);

    List<EhrPerformance> selectByExample(EhrPerformanceExample example);

    EhrPerformance selectByPrimaryKey(String enumber);

    int updateByExampleSelective(@Param("record") EhrPerformance record, @Param("example") EhrPerformanceExample example);

    int updateByExample(@Param("record") EhrPerformance record, @Param("example") EhrPerformanceExample example);

    int updateByPrimaryKeySelective(EhrPerformance record);

    int updateByPrimaryKey(EhrPerformance record);
}