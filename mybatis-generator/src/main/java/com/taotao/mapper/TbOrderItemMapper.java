package com.taotao.mapper;

import com.taotao.pojo.TbOrderItem;
import com.taotao.pojo.TbOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderItemMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbOrderItemExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbOrderItemExample example);

    /**
     * @mbg.generated insert
     */
    int insert(TbOrderItem record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbOrderItem record);

    /**
     * @mbg.generated selectByExample
     */
    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);
}