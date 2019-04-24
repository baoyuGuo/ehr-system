package com.ehr.mapper;

import com.ehr.pojo.EhrSsRecords;
import com.ehr.pojo.EhrSsRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrSsRecordsMapper {
    int countByExample(EhrSsRecordsExample example);

    int deleteByExample(EhrSsRecordsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EhrSsRecords record);

    int insertSelective(EhrSsRecords record);

    List<EhrSsRecords> selectByExample(EhrSsRecordsExample example);

    EhrSsRecords selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EhrSsRecords record, @Param("example") EhrSsRecordsExample example);

    int updateByExample(@Param("record") EhrSsRecords record, @Param("example") EhrSsRecordsExample example);

    int updateByPrimaryKeySelective(EhrSsRecords record);

    int updateByPrimaryKey(EhrSsRecords record);
}