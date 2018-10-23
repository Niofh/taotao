package com.taotao.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.common.pojo.EasyUiTree;
import com.taotao.common.pojo.ResultJson;
import com.taotao.pojo.TbItemParam;
import com.taotao.service.ItemCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商品分类
 *
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/18 13:58
 */
@Controller
public class ItemCarController {
    @Autowired
    private ItemCarService itemCarService;

    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<EasyUiTree> getItemCatById(@RequestParam(value = "id", defaultValue = "0") Long id) {
        return itemCarService.getItemCarById(id);
    }


    @RequestMapping("/item/cat/params/list")
    @ResponseBody
    public EasyUIDataGridResult<TbItemParam> getItemCatParamsList(Integer page, Integer rows) {
        return itemCarService.getItemCatParamsList(page, rows);
    }

    /**
     * 判端商品分类是否存在商品规则模板
     *
     * @param id
     * @return
     */
    @RequestMapping("/item/car/paramsById/{id}")
    @ResponseBody
    public ResultJson getItemCatParamsById(@PathVariable Long id) {
        try {
            return itemCarService.getItemCatParamsById(id);
        } catch (Exception e) {
            return ResultJson.error("操作失败", null);
        }
    }

    /**
     * 添加商品规则模板
     *
     * @param id
     * @param paramData
     * @return
     */
    @RequestMapping("/item/cat/param/save/{id}")
    @ResponseBody
    public ResultJson saveParam(@PathVariable Long id, String paramData) {
        try {
            return itemCarService.saveParam(id, paramData);
        } catch (Exception e) {
            return ResultJson.error("操作失败", null);
        }
    }


}
