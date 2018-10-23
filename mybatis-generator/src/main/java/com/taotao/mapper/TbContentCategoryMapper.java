package com.taotao.mapper;

import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbContentCategoryMapper {
    /**
     * @mbg.generated countByExample
     */
    long countByExample(TbContentCategoryExample example);

    /**
     * @mbg.generated deleteByExample
     */
    int deleteByExample(TbContentCategoryExample example);

    /**
     * @mbg.generated deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated insert
     */
    int insert(TbContentCategory record);

    /**
     * @mbg.generated insertSelective
     */
    int insertSelective(TbContentCategory record);

    /**
     * @mbg.generated selectByExample
     */
    List<TbContentCategory> selectByExample(TbContentCategoryExample example);

    /**
     * @mbg.generated selectByPrimaryKey
     */
    TbContentCategory selectByPrimaryKey(Long id);

    /**
     * @mbg.generated updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);

    /**
     * @mbg.generated updateByExample
     */
    int updateByExample(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);

    /**
     * @mbg.generated updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(TbContentCategory record);

    /**
     * @mbg.generated updateByPrimaryKey
     */
    int updateByPrimaryKey(TbContentCategory record);
}