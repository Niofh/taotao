package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.mapper.TbContentMapper;
import com.taotao.pojo.TbContent;
import com.taotao.pojo.TbContentExample;
import com.taotao.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/23 13:48
 */
@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private TbContentMapper tbContentMapper;


    /**
     * 获取内容列表
     *
     * @param contentCategoryId 内容分类Id
     * @param page
     * @param rows
     * @return
     */
    @Override
    public EasyUIDataGridResult<TbContent> getContentList(Long contentCategoryId, Integer page, Integer rows) {

        // 分页
        PageHelper.startPage(page, rows);

        // 查询出内容分类下的内容列表
        TbContentExample example = new TbContentExample();
        TbContentExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdEqualTo(contentCategoryId);
        List<TbContent> tbContentList = tbContentMapper.selectByExample(example);

        PageInfo<TbContent> pageInfo = new PageInfo<>(tbContentList);
        EasyUIDataGridResult<TbContent> result = new EasyUIDataGridResult<>();
        result.setRows(tbContentList);
        result.setTotal(pageInfo.getTotal());

        return result;
    }
}
