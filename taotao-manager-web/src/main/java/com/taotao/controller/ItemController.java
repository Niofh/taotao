package com.taotao.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.ResultJson;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import com.taotao.vo.ItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品管理
 *
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/14 0:15
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/item/{id}", method = {RequestMethod.GET})
    @ResponseBody
    public TbItem getItemById(@PathVariable Long id) {
        return itemService.getItemByID(id);
    }

    @RequestMapping(value = "/item/list", method = {RequestMethod.GET})
    @ResponseBody
    public EasyUIDataGridResult<TbItem> getItemById(Integer page, Integer rows) {
        return itemService.getItemList(page, rows);
    }

    @RequestMapping(value = "/item/save", method = {RequestMethod.POST})
    @ResponseBody
    public ResultJson itemSave(TbItem tbItem, String desc) {
        try {
            return itemService.createItem(tbItem, desc);

        } catch (Exception e) {

            return ResultJson.error("添加商品失败", null);
        }
    }

    @RequestMapping("/item/delete")
    @ResponseBody
    public ResultJson deleteItem(ItemVo itemVo) {
        try {
            return itemService.deleteItem(itemVo.getIds());
        } catch (Exception e) {

            return ResultJson.error("删除商品失败", null);
        }
    }

    @RequestMapping("/item/shelf")
    @ResponseBody
    public ResultJson shelfItem(ItemVo itemVo) {
        try {
            return itemService.shelfItem(itemVo.getIds());
        } catch (Exception e) {

            return ResultJson.error("上架商品失败", null);
        }
    }

    @RequestMapping("/item/lower")
    @ResponseBody
    public ResultJson lowerItem(ItemVo itemVo) {
        try {
            return itemService.lowerItem(itemVo.getIds());
        } catch (Exception e) {

            return ResultJson.error("下架商品失败", null);
        }
    }

    /**
     * 商品规格参数列表
     * @return
     */
    @RequestMapping("/item/param/list")
    @ResponseBody
    public ResultJson getItemParamsList() {
        return null;
    }


}
