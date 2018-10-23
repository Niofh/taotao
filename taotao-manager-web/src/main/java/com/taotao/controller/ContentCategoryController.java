package com.taotao.controller;

import com.taotao.common.pojo.EasyUiTree;
import com.taotao.common.pojo.ResultJson;
import com.taotao.service.ContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 内容分类
 *
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/22 17:46
 */
@Controller
public class ContentCategoryController {
    @Autowired
    private ContentCategoryService contentCategoryService;


    @RequestMapping("/content/category/list")
    @ResponseBody
    public List<EasyUiTree> getContentCategoryList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
        return contentCategoryService.getContentCategoryList(parentId);
    }

    @RequestMapping("/content/category/create")
    @ResponseBody
    public ResultJson addContentCategory(Long parentId, String name) {
        return contentCategoryService.addContentCategory(parentId, name);
    }


    @RequestMapping("/content/category/update")
    @ResponseBody
    public ResultJson updateContentCategory(Long id, String name) {
        return contentCategoryService.updateContentCategory(id, name);
    }

    @RequestMapping("/content/category/delete")
    @ResponseBody
    public ResultJson deleteContentCategory(Long parentId, Long id) {
        System.out.println(id);
        System.out.println(parentId);
        return contentCategoryService.deleteContentCategory(parentId, id);
    }

}
