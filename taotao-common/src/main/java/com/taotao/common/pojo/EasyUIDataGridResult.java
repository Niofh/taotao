package com.taotao.common.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * EasyUI分页数据返回
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/15 22:51
 */
public class EasyUIDataGridResult<T> implements Serializable {

    private static final long serialVersionUID = 4842026966596174263L;
    /**
     * 总条数
     */
    private Long total;

    /**
     * 分页的数据
     */
    private List<T> rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
