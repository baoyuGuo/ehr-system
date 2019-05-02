package com.ehr.mapper;

import com.ehr.pojo.EhrAppeal;
import com.ehr.pojo.EhrAppealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrAppealMapper {
    int countByExample(EhrAppealExample example);

    int deleteByExample(EhrAppealExample example);

    int deleteByPrimaryKey(String enumber);

    int insert(EhrAppeal record);

    int insertSelective(EhrAppeal record);

    List<EhrAppeal> selectByExample(EhrAppealExample example);

    EhrAppeal selectByPrimaryKey(String enumber);

    int updateByExampleSelective(@Param("record") EhrAppeal record, @Param("example") EhrAppealExample example);

    int updateByExample(@Param("record") EhrAppeal record, @Param("example") EhrAppealExample example);

    int updateByPrimaryKeySelective(EhrAppeal record);

    int updateByPrimaryKey(EhrAppeal record);
}