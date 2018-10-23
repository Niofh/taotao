package com.taotao.mapper;

import com.taotao.pojo.TbOrder;
import com.taotao.pojo.TbOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrderMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbOrderExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbOrderExample example);

    /**
     * @mbg.generated insert
     */
    int insert(TbOrder record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbOrder record);

    /**
     * @mbg.generated selectByExample
     */
    List<TbOrder> selectByExample(TbOrderExample example);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbOrder record, @Param("example") TbOrderExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbOrder record, @Param("example") TbOrderExample example);
}