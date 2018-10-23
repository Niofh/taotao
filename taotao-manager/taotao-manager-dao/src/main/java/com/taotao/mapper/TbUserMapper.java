package com.taotao.mapper;

import com.taotao.pojo.TbUser;
import com.taotao.pojo.TbUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbUserMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbUserExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbUserExample example);

    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated insert
     */
    int insert(TbUser record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbUser record);

    /**
     * @mbg.generated selectByExample
     */
    List<TbUser> selectByExample(TbUserExample example);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    TbUser selectByPrimaryKey(Long id);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TbUser record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(TbUser record);
}