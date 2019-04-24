package com.ehr.mapper;

import com.ehr.pojo.EhrUser;
import com.ehr.pojo.EhrUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrUserMapper {
    int countByExample(EhrUserExample example);

    int deleteByExample(EhrUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EhrUser record);

    int insertSelective(EhrUser record);

    List<EhrUser> selectByExample(EhrUserExample example);

    EhrUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EhrUser record, @Param("example") EhrUserExample example);

    int updateByExample(@Param("record") EhrUser record, @Param("example") EhrUserExample example);

    int updateByPrimaryKeySelective(EhrUser record);

    int updateByPrimaryKey(EhrUser record);
}