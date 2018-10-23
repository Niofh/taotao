package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.EasyUiTree;
import com.taotao.common.pojo.ResultJson;
import com.taotao.pojo.TbItemParam;

import java.util.List;

/**
 * 商品分类接口
 *
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/18 11:53
 */
public interface ItemCarService {
    /**
     * 根据parentId获取商品分类
     * @param parentId
     * @return
     */
    List<EasyUiTree> getItemCarById(Long parentId);


    /**
     * 获取规格参数列表(定义模板)
     * @param page
     * @param rows
     * @return
     */
    EasyUIDataGridResult<TbItemParam> getItemCatParamsList(Integer page, Integer rows);

    /**
     * 通过商品分类id判断是否有规则模板
     * @param id
     * @return
     * @throws Exception
     */
    ResultJson getItemCatParamsById(Long id) throws Exception;

    /**
     * 添加商品规则模板
     * @param id 商品分类id
     * @param paramData 规则模板json数据
     * @return
     */
    ResultJson saveParam(Long id,String paramData) throws Exception;
}
