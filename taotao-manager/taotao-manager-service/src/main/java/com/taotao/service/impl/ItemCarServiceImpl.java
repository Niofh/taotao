package com.taotao.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.EasyUiTree;
import com.taotao.common.pojo.ResultJson;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.mapper.TbItemParamMapper;
import com.taotao.mapper.customize.ItemParamMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemParam;
import com.taotao.pojo.TbItemParamExample;
import com.taotao.service.ItemCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 商品分类接口
 *
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/18 11:53
 */
@Service
public class ItemCarServiceImpl implements ItemCarService {
    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Autowired
    private TbItemParamMapper tbItemParamMapper;

    @Autowired
    private ItemParamMapper itemParamMapper;

    /**
     * 根据parentId获取商品分类
     *
     * @param parentId
     * @return
     */
    @Override
    public List<EasyUiTree> getItemCarById(Long parentId) {

        // 数据库获取商品分类
        TbItemCatExample tbItemCatExample = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = tbItemCatExample.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TbItemCat> tbItemCats = tbItemCatMapper.selectByExample(tbItemCatExample);

        // 改造数据
        ArrayList<EasyUiTree> easyUiTrees = new ArrayList<>();
        for (TbItemCat tbItemCat : tbItemCats) {
            EasyUiTree easyUiTree = new EasyUiTree();
            easyUiTree.setId(tbItemCat.getId());
            easyUiTree.setState(tbItemCat.getIsParent() ? "closed" : "open");
            easyUiTree.setText(tbItemCat.getName());
            easyUiTrees.add(easyUiTree);
        }

        return easyUiTrees;
    }

    /**
     * 获取规格参数列表(定义模板)
     *
     * @param page
     * @param rows
     * @return
     */
    @Override
    public EasyUIDataGridResult<TbItemParam> getItemCatParamsList(Integer page, Integer rows) {

        Page<Object> pageHelper = (Page<Object>) PageHelper.startPage(page, rows);
        System.out.println(pageHelper);
        List<TbItemParam> tbItemParamList = itemParamMapper.selectItemCarParam();

        EasyUIDataGridResult<TbItemParam> easyUIDataGridResult = new EasyUIDataGridResult<>();
        easyUIDataGridResult.setTotal(pageHelper.getTotal());
        easyUIDataGridResult.setRows(tbItemParamList);

        return easyUIDataGridResult;
    }

    /**
     * 通过商品分类id判断是否有规则模板
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public ResultJson getItemCatParamsById(Long id) throws Exception {

        TbItemParam tbItemParam = tbItemParamMapper.selectByPrimaryKey(id);

        return ResultJson.success("", tbItemParam.getParamData());
    }

    /**
     * 添加商品规则模板
     *
     * @param id 商品分类id
     * @param paramData 规则模板json数据
     * @return
     */
    @Override
    public ResultJson saveParam(Long id,String paramData) throws Exception {
        TbItemParam tbItemParam = new TbItemParam();
        tbItemParam.setItemCatId(id);
        tbItemParam.setParamData(paramData);
        tbItemParam.setCreated(new Date());
        tbItemParam.setUpdated(new Date());
        tbItemParamMapper.insert(tbItemParam);

        return ResultJson.success("添加规则成功",tbItemParam);
    }
}
