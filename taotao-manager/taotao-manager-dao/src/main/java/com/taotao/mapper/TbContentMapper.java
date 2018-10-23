package com.taotao.mapper;

import com.taotao.pojo.TbContent;
import com.taotao.pojo.TbContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbContentExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbContentExample example);

    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated insert
     */
    int insert(TbContent record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbContent record);

    /**
     * @mbg.generated selectByExampleWithBLOBs
     */
    List<TbContent> selectByExampleWithBLOBs(TbContentExample example);

    /**
     * @mbg.generated selectByExample
     */
    List<TbContent> selectByExample(TbContentExample example);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    TbContent selectByPrimaryKey(Long id);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     * @mbg.generated updateByExampleWithBLOBs
     */
    int updateByExampleWithBLOBs(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TbContent record);

    /**
     * @mbg.generated updateByPrimaryKeyWithBLOBs
     */
    int updateByPrimaryKeyWithBLOBs(TbContent record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(TbContent record);
}