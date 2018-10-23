package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.Utli.IDUtli;
import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.ResultJson;
import com.taotao.mapper.TbItemDescMapper;
import com.taotao.mapper.TbItemMapper;
import com.taotao.mapper.TbItemParamMapper;
import com.taotao.pojo.*;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/13 23:03
 */

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    @Autowired
    private TbItemDescMapper tbItemDescMapper;




    @Override
    public TbItem getItemByID(Long id) {
        return tbItemMapper.selectByPrimaryKey(id);
    }


    @Override
    public EasyUIDataGridResult<TbItem> getItemList(Integer page, Integer rows) {
        PageHelper.startPage(page, rows);
        //创建Example对象
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        ArrayList<Byte> statusList = new ArrayList<>();
        statusList.add((byte) 1);
        statusList.add((byte) 2);
        criteria.andStatusIn(statusList);
        List<TbItem> list = tbItemMapper.selectByExample(example);

        PageInfo<TbItem> pageInfo = new PageInfo<>(list);

        // // 设置返回数据
        EasyUIDataGridResult<TbItem> tbItemEasyUIDataGridResult = new EasyUIDataGridResult<>();
        tbItemEasyUIDataGridResult.setRows(list);
        tbItemEasyUIDataGridResult.setTotal(pageInfo.getTotal());

        return tbItemEasyUIDataGridResult;
    }




    /**
     * 添加商品
     *
     * @param tbItem
     * @param itemDesc
     * @return
     */
    @Override
    public ResultJson createItem(TbItem tbItem, String itemDesc) throws Exception {

        // 生成商品id
        tbItem.setId(IDUtli.genItemId());
        tbItem.setStatus((byte) 1); //商品状态，1-正常，2-下架，3-删除

        tbItem.setCreated(new Date());
        tbItem.setUpdated(new Date());
        tbItemMapper.insert(tbItem);

        this.createItemDesc(tbItem.getId(), itemDesc);

        return ResultJson.success("添加商品成功", null);
    }

    /**
     * 删除商品
     *
     * @param ids
     * @return
     * @throws Exception
     */
    @Override
    public ResultJson deleteItem(List<Long> ids) throws Exception {
        System.out.println(ids);
        return this.changItemStatus(ids, 3);
    }

    /**
     * 上架商品
     *
     * @param ids
     * @return
     * @throws Exception
     */
    @Override
    public ResultJson shelfItem(List<Long> ids) throws Exception {
        return this.changItemStatus(ids, 1); // '商品状态，1-正常，2-下架，3-删除',
    }

    /**
     * 下架商品
     *
     * @param ids
     * @return
     * @throws Exception
     */
    @Override
    public ResultJson lowerItem(List<Long> ids) throws Exception {
        return this.changItemStatus(ids, 2);
    }

    /**
     * 改变商品状态
     * @param ids
     * @param status
     * @return
     */
    private ResultJson changItemStatus(List<Long> ids, int status) {
        for (Long id : ids) {
            TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);
            tbItem.setStatus((byte) status);
            tbItem.setUpdated(new Date());
            tbItemMapper.updateByPrimaryKey(tbItem);
        }
        return ResultJson.success();
    }


    /**
     * 商品描述
     *
     * @param itemId   商品id
     * @param itemDesc
     */
    private void createItemDesc(Long itemId, String itemDesc) {
        TbItemDesc tbItemDesc = new TbItemDesc();
        //商品id
        tbItemDesc.setItemId(itemId);
        tbItemDesc.setItemDesc(itemDesc);

        tbItemDesc.setCreated(new Date());
        tbItemDesc.setUpdated(new Date());

        tbItemDescMapper.insert(tbItemDesc);

    }
}
