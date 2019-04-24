package com.ehr.mapper;

import com.ehr.pojo.EhrContract;
import com.ehr.pojo.EhrContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrContractMapper {
    int countByExample(EhrContractExample example);

    int deleteByExample(EhrContractExample example);

    int deleteByPrimaryKey(String cid);

    int insert(EhrContract record);

    int insertSelective(EhrContract record);

    List<EhrContract> selectByExample(EhrContractExample example);

    EhrContract selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") EhrContract record, @Param("example") EhrContractExample example);

    int updateByExample(@Param("record") EhrContract record, @Param("example") EhrContractExample example);

    int updateByPrimaryKeySelective(EhrContract record);

    int updateByPrimaryKey(EhrContract record);
}