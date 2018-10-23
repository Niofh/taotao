package com.taotao.mapper;

import com.taotao.pojo.TbCart;
import com.taotao.pojo.TbCartExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbCartMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbCartExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbCartExample example);

    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated insert
     */
    int insert(TbCart record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbCart record);

    /**
     * @mbg.generated selectByExample
     */
    List<TbCart> selectByExample(TbCartExample example);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    TbCart selectByPrimaryKey(Long id);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbCart record, @Param("example") TbCartExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbCart record, @Param("example") TbCartExample example);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TbCart record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(TbCart record);
}