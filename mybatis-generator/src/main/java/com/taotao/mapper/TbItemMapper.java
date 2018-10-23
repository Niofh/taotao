package com.taotao.mapper;

import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbItemExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbItemExample example);

    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated insert
     */
    int insert(TbItem record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbItem record);

    /**
     * @mbg.generated selectByExample
     */
    List<TbItem> selectByExample(TbItemExample example);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    TbItem selectByPrimaryKey(Long id);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbItem record, @Param("example") TbItemExample example);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TbItem record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(TbItem record);
}