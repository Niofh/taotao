package com.taotao.service;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.ResultJson;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemParam;

import java.util.List;

/**
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/13 23:02
 */
public interface ItemService {


    /*通过id查询商品*/
    TbItem getItemByID(Long id);
    /**
     * 分页获取商品集合
     *
     * @return List<TbItem>
     */
    EasyUIDataGridResult<TbItem> getItemList(Integer page, Integer rows);





    /**
     * 添加商品
     * @param tbItem
     * @param itemDesc
     * @return
     */
    ResultJson createItem(TbItem tbItem,String itemDesc) throws Exception;

    /**
     * 删除商品
     * @param ids
     * @return
     * @throws Exception
     */
    ResultJson deleteItem(List<Long> ids) throws Exception;

    /**
     * 上架商品
     * @param ids
     * @return
     * @throws Exception
     */
    ResultJson shelfItem(List<Long> ids) throws Exception;


    /**
     * 下架商品
     * @param ids
     * @return
     * @throws Exception
     */
    ResultJson lowerItem(List<Long> ids) throws Exception;




}
