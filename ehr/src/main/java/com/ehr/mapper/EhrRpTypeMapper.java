package com.ehr.mapper;

import com.ehr.pojo.EhrRpType;
import com.ehr.pojo.EhrRpTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrRpTypeMapper {
    int countByExample(EhrRpTypeExample example);

    int deleteByExample(EhrRpTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EhrRpType record);

    int insertSelective(EhrRpType record);

    List<EhrRpType> selectByExample(EhrRpTypeExample example);

    EhrRpType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EhrRpType record, @Param("example") EhrRpTypeExample example);

    int updateByExample(@Param("record") EhrRpType record, @Param("example") EhrRpTypeExample example);

    int updateByPrimaryKeySelective(EhrRpType record);

    int updateByPrimaryKey(EhrRpType record);
}