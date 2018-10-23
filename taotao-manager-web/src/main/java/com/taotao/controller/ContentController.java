package com.taotao.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbContent;
import com.taotao.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 内容管理
 *
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/23 14:02
 */
@RestController
public class ContentController {
    @Autowired
    private ContentService contentService;

    @RequestMapping("/content/query/list")
    public EasyUIDataGridResult<TbContent> getContentList(Long categoryId, Integer page, Integer rows) {

        return contentService.getContentList(categoryId, page, rows);
    }
}
