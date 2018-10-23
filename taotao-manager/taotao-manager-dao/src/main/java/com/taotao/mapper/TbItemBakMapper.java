package com.taotao.mapper;

import com.taotao.pojo.TbItemBak;
import com.taotao.pojo.TbItemBakExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemBakMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbItemBakExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbItemBakExample example);

    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated insert
     */
    int insert(TbItemBak record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbItemBak record);

    /**
     * @mbg.generated selectByExample
     */
    List<TbItemBak> selectByExample(TbItemBakExample example);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    TbItemBak selectByPrimaryKey(Long id);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbItemBak record, @Param("example") TbItemBakExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbItemBak record, @Param("example") TbItemBakExample example);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TbItemBak record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(TbItemBak record);
}