package com.taotao.mapper;

import com.taotao.pojo.TbItemDescBak;
import com.taotao.pojo.TbItemDescBakExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemDescBakMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbItemDescBakExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbItemDescBakExample example);

    /**
     * @mbg.generated insert
     */
    int insert(TbItemDescBak record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbItemDescBak record);

    /**
     * @mbg.generated selectByExampleWithBLOBs
     */
    List<TbItemDescBak> selectByExampleWithBLOBs(TbItemDescBakExample example);

    /**
     * @mbg.generated selectByExample
     */
    List<TbItemDescBak> selectByExample(TbItemDescBakExample example);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbItemDescBak record, @Param("example") TbItemDescBakExample example);

    /**
     * @mbg.generated updateByExampleWithBLOBs
     */
    int updateByExampleWithBLOBs(@Param("record") TbItemDescBak record, @Param("example") TbItemDescBakExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbItemDescBak record, @Param("example") TbItemDescBakExample example);
}