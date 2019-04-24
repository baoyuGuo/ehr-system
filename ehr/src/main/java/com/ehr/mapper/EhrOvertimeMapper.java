package com.ehr.mapper;

import com.ehr.pojo.EhrOvertime;
import com.ehr.pojo.EhrOvertimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrOvertimeMapper {
    int countByExample(EhrOvertimeExample example);

    int deleteByExample(EhrOvertimeExample example);

    int deleteByPrimaryKey(String enumber);

    int insert(EhrOvertime record);

    int insertSelective(EhrOvertime record);

    List<EhrOvertime> selectByExample(EhrOvertimeExample example);

    EhrOvertime selectByPrimaryKey(String enumber);

    int updateByExampleSelective(@Param("record") EhrOvertime record, @Param("example") EhrOvertimeExample example);

    int updateByExample(@Param("record") EhrOvertime record, @Param("example") EhrOvertimeExample example);

    int updateByPrimaryKeySelective(EhrOvertime record);

    int updateByPrimaryKey(EhrOvertime record);
}