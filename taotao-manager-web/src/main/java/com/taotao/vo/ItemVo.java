package com.taotao.vo;

import java.util.List;

/**
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/23 14:47
 */
public class ItemVo {
    List<Long> ids;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "ItemVo{" +
                "ids=" + ids +
                '}';
    }
}
