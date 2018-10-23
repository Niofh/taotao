package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbContent;

/**
 *
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/23 11:07
 */
public interface ContentService {

    /**
     * 获取内容列表
     * @param contentCategoryId 内容分类Id
     * @param page
     * @param rows
     * @return
     */
    EasyUIDataGridResult<TbContent> getContentList(Long contentCategoryId,Integer page, Integer rows);
}
