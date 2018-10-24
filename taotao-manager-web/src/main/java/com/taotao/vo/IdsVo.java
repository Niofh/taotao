package com.taotao.vo;

import java.util.List;

/**
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/24 14:43
 */
public class IdsVo {
    List<Long> ids;

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "IdsVo{" +
                "ids=" + ids +
                '}';
    }
}
