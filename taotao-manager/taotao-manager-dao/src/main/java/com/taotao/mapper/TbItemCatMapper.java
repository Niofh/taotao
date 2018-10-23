package com.taotao.mapper;

import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemCatMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbItemCatExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbItemCatExample example);

    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated insert
     */
    int insert(TbItemCat record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbItemCat record);

    /**
     * @mbg.generated selectByExample
     */
    List<TbItemCat> selectByExample(TbItemCatExample example);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    TbItemCat selectByPrimaryKey(Long id);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TbItemCat record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(TbItemCat record);
}