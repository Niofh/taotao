package com.taotao.service;

import com.taotao.common.pojo.EasyUiTree;
import com.taotao.common.pojo.ResultJson;
import com.taotao.pojo.TbContentCategory;

import java.util.List;

/**
 * 内容分类
 *
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/22 17:33
 */
public interface ContentCategoryService {

    /**
     * 根据父id渲染内容分类
     * @param parentId
     * @return
     */
    List<EasyUiTree> getContentCategoryList(Long parentId);


    /**
     * 添加内容分类
     * @param parentId
     * @param name
     * @return
     */
    ResultJson addContentCategory(Long parentId, String name);

    /**
     * 修改分类
     * @param id
     * @param name
     * @return
     */
    ResultJson updateContentCategory(Long id, String name);


    /**
     * 删除分类
     * @param parentId
     * @param id
     * @return
     */
    ResultJson deleteContentCategory(Long parentId,Long id);




}
