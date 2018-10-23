package com.taotao.service.impl;

import com.taotao.common.pojo.EasyUiTree;
import com.taotao.common.pojo.ResultJson;
import com.taotao.mapper.TbContentCategoryMapper;
import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import com.taotao.service.ContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 内容分类
 *
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/22 17:35
 */
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {


    @Autowired
    private TbContentCategoryMapper tbContentCategoryMapper;

    /**
     * 根据父id渲染内容分类
     *
     * @param parentId
     * @return
     */
    @Override
    public List<EasyUiTree> getContentCategoryList(Long parentId) {

        // 查询有多少个子节点
        TbContentCategoryExample tbContentCategoryExample = new TbContentCategoryExample();

        TbContentCategoryExample.Criteria criteria = tbContentCategoryExample.createCriteria();

        // 1是正常，2是删除
        criteria.andParentIdEqualTo(parentId).andStatusEqualTo(1);

        //获取当前父id的子节点
        List<TbContentCategory> tbContentCategories = tbContentCategoryMapper.selectByExample(tbContentCategoryExample);

        System.out.println(tbContentCategories);

        // 改造数据
        List<EasyUiTree> easyUiTreeList = new ArrayList<>();

        for (TbContentCategory tbContentCategory : tbContentCategories) {
            EasyUiTree easyUiTree = new EasyUiTree();
            easyUiTree.setId(tbContentCategory.getId());
            easyUiTree.setText(tbContentCategory.getName());
            easyUiTree.setState(tbContentCategory.getIsParent() ? "closed" : "open");

            easyUiTreeList.add(easyUiTree);

        }


        return easyUiTreeList;
    }

    /**
     * 添加内容分类
     *
     * @param parentId
     * @param name
     * @return
     */
    @Override
    public ResultJson addContentCategory(Long parentId, String name) {

        // 实例化一个对象
        TbContentCategory tbContentCategory = new TbContentCategory();

        // 填充属性值
        tbContentCategory.setParentId(parentId);
        tbContentCategory.setName(name);
        tbContentCategory.setStatus(1); // '状态。可选值:1(正常),2(删除)'
        tbContentCategory.setSortOrder(1);
        tbContentCategory.setIsParent(false); // '该类目是否为父类目，1为true，0为false',
        tbContentCategory.setCreated(new Date());
        tbContentCategory.setUpdated(new Date());

        // 插入数据
        tbContentCategoryMapper.insertSelective(tbContentCategory);

        // 当前如果父级IsParent为false，就改为true

        TbContentCategory contentCategoryParent = tbContentCategoryMapper.selectByPrimaryKey(parentId);

        if (!contentCategoryParent.getIsParent()) {
            contentCategoryParent.setIsParent(true);
            tbContentCategoryMapper.updateByPrimaryKey(contentCategoryParent);
        }

        return ResultJson.success("添加成功", tbContentCategory);
    }

    /**
     * 修改分类
     *
     * @param id
     * @param name
     * @return
     */
    @Override
    public ResultJson updateContentCategory(Long id, String name) {
        TbContentCategory contentCategory = tbContentCategoryMapper.selectByPrimaryKey(id);
        contentCategory.setName(name);

        tbContentCategoryMapper.updateByPrimaryKey(contentCategory);

        return ResultJson.success("修改成功", contentCategory);
    }

    /**
     * 删除分类
     *
     * @param parentId
     * @param id
     * @return
     */
    @Override
    public ResultJson deleteContentCategory(Long parentId, Long id) {

        // 当前节点删除
        TbContentCategory contentCategory = tbContentCategoryMapper.selectByPrimaryKey(id);
        contentCategory.setId(id);
        contentCategory.setStatus(2); // '状态。可选值:1(正常),2(删除)'
        tbContentCategoryMapper.updateByPrimaryKey(contentCategory);
        treeNodeDelete(contentCategory,id);
        return ResultJson.success();
    }

    /**
     * 递归删除节点
     * @param contentCategory 当前节点
     * @param id 当前节点id
     */
    private void treeNodeDelete(TbContentCategory contentCategory, Long id) {
        // 当前节点如果有子节点，就删除所有子节点
        if (contentCategory.getIsParent()) {

            // 查询所有子节点
            TbContentCategoryExample example = new TbContentCategoryExample();
            TbContentCategoryExample.Criteria criteria = example.createCriteria();
            criteria.andParentIdEqualTo(id);
            List<TbContentCategory> tbContentCategories = tbContentCategoryMapper.selectByExample(example);

            // 循环改变子节点的状态
            for (TbContentCategory tbContentCategory : tbContentCategories) {
                tbContentCategory.setStatus(2);
                tbContentCategoryMapper.updateByPrimaryKey(tbContentCategory);
                // 如果子节点还是有子节点，就递归删除
                if (tbContentCategory.getIsParent()) {
                    this.treeNodeDelete(tbContentCategory, tbContentCategory.getId());
                }
            }

        }
    }

}
