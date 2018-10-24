package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.ResultJson;
import com.taotao.mapper.TbContentMapper;
import com.taotao.pojo.TbContent;
import com.taotao.pojo.TbContentExample;
import com.taotao.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        List<TbContent> tbContentList = tbContentMapper.selectByExampleWithBLOBs(example);

        PageInfo<TbContent> pageInfo = new PageInfo<>(tbContentList);
        EasyUIDataGridResult<TbContent> result = new EasyUIDataGridResult<>();
        result.setRows(tbContentList);
        result.setTotal(pageInfo.getTotal());

        return result;
    }

    /**
     * 添加内容
     *
     * @param tbContent
     * @return
     */
    @Override
    public ResultJson addContent(TbContent tbContent) {
        tbContent.setCreated(new Date());
        tbContent.setUpdated(new Date());
        tbContentMapper.insert(tbContent);
        return ResultJson.success("添加成功", tbContent);
    }

    /**
     * 修改内容
     *
     * @param tbContent
     * @return
     */
    @Override
    public ResultJson updateContent(TbContent tbContent) {

        tbContentMapper.updateByPrimaryKeyWithBLOBs(tbContent);

        return ResultJson.success("修改", tbContent);
    }

    /**
     * 删除内容
     *
     * @param ids
     * @return
     */
    @Override
    public ResultJson deleteContent(List<Long> ids) throws Exception {
        for (Long id : ids) {
            tbContentMapper.deleteByPrimaryKey(id);
        }
        return ResultJson.success("删除成功",null);
    }
}
