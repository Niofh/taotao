package com.taotao.mapper.customize;

import com.taotao.mapper.TbItemParamMapper;
import com.taotao.pojo.TbItemParam;

import java.util.List;

/**
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/23 17:45
 */
public interface ItemParamMapper extends TbItemParamMapper {

    /**
     * 关联查询列表
     * @return
     */
    List<TbItemParam> selectItemCarParam();


}
