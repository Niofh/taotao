package com.taotao.mapper;

import com.taotao.pojo.TbItemParamItem;
import com.taotao.pojo.TbItemParamItemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemParamItemMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbItemParamItemExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbItemParamItemExample example);

    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated insert
     */
    int insert(TbItemParamItem record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbItemParamItem record);

    /**
     * @mbg.generated selectByExampleWithBLOBs
     */
    List<TbItemParamItem> selectByExampleWithBLOBs(TbItemParamItemExample example);

    /**
     * @mbg.generated selectByExample
     */
    List<TbItemParamItem> selectByExample(TbItemParamItemExample example);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    TbItemParamItem selectByPrimaryKey(Long id);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    /**
     * @mbg.generated updateByExampleWithBLOBs
     */
    int updateByExampleWithBLOBs(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TbItemParamItem record);

    /**
     * @mbg.generated updateByPrimaryKeyWithBLOBs
     */
    int updateByPrimaryKeyWithBLOBs(TbItemParamItem record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(TbItemParamItem record);
}