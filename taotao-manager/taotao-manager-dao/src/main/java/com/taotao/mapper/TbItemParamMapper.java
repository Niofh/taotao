package com.taotao.mapper;

import com.taotao.pojo.TbItemParam;
import com.taotao.pojo.TbItemParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemParamMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbItemParamExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbItemParamExample example);

    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated insert
     */
    int insert(TbItemParam record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbItemParam record);



    /**
     * @mbg.generated selectByExampleWithBLOBs
     */
    List<TbItemParam> selectByExampleWithBLOBs(TbItemParamExample example);

    /**
     * @mbg.generated selectByExample
     */
    List<TbItemParam> selectByExample(TbItemParamExample example);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    TbItemParam selectByPrimaryKey(Long id);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * @mbg.generated updateByExampleWithBLOBs
     */
    int updateByExampleWithBLOBs(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TbItemParam record);

    /**
     * @mbg.generated updateByPrimaryKeyWithBLOBs
     */
    int updateByPrimaryKeyWithBLOBs(TbItemParam record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(TbItemParam record);
}