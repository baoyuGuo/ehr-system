package com.ehr.mapper;

import com.ehr.pojo.EhrSalaryAccounts;
import com.ehr.pojo.EhrSalaryAccountsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrSalaryAccountsMapper {
    int countByExample(EhrSalaryAccountsExample example);

    int deleteByExample(EhrSalaryAccountsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EhrSalaryAccounts record);

    int insertSelective(EhrSalaryAccounts record);

    List<EhrSalaryAccounts> selectByExample(EhrSalaryAccountsExample example);

    EhrSalaryAccounts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EhrSalaryAccounts record, @Param("example") EhrSalaryAccountsExample example);

    int updateByExample(@Param("record") EhrSalaryAccounts record, @Param("example") EhrSalaryAccountsExample example);

    int updateByPrimaryKeySelective(EhrSalaryAccounts record);

    int updateByPrimaryKey(EhrSalaryAccounts record);
}