package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.ResultJson;
import com.taotao.pojo.TbContent;

import java.util.List;

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

    /**
     * 添加内容
     * @param tbContent
     * @return
     */
    ResultJson addContent(TbContent tbContent);

    /**
     * 修改内容
     * @param tbContent
     * @return
     */
    ResultJson updateContent(TbContent tbContent);

    /**
     * 删除内容
     * @param ids
     * @return
     */
    ResultJson deleteContent(List<Long> ids) throws Exception;
}
