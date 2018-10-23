package com.taotao.mapper;

import com.taotao.pojo.TbItemDesc;
import com.taotao.pojo.TbItemDescExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemDescMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbItemDescExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbItemDescExample example);

    /**
     * @mbg.generated insert
     */
    int insert(TbItemDesc record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbItemDesc record);

    /**
     * @mbg.generated selectByExampleWithBLOBs
     */
    List<TbItemDesc> selectByExampleWithBLOBs(TbItemDescExample example);

    /**
     * @mbg.generated selectByExample
     */
    List<TbItemDesc> selectByExample(TbItemDescExample example);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbItemDesc record, @Param("example") TbItemDescExample example);

    /**
     * @mbg.generated updateByExampleWithBLOBs
     */
    int updateByExampleWithBLOBs(@Param("record") TbItemDesc record, @Param("example") TbItemDescExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbItemDesc record, @Param("example") TbItemDescExample example);
}