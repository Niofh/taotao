package com.taotao.mapper;

import com.taotao.pojo.TbOrderShipping;
import com.taotao.pojo.TbOrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderShippingMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbOrderShippingExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbOrderShippingExample example);

    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * @mbg.generated insert
     */
    int insert(TbOrderShipping record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbOrderShipping record);

    /**
     * @mbg.generated selectByExample
     */
    List<TbOrderShipping> selectByExample(TbOrderShippingExample example);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    TbOrderShipping selectByPrimaryKey(String orderId);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbOrderShipping record, @Param("example") TbOrderShippingExample example);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TbOrderShipping record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(TbOrderShipping record);
}