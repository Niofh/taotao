package com.taotao.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 *  TABLE 2018-10-13
 */
public class TbItemDescBak  implements Serializable {

    private static final long serialVersionUID = 4631486721310748607L;
    /**
     * 商品ID
     *
     * @mbg.generated 2018-10-13
     */
    private Long itemId;

    /**
     * 创建时间
     *
     * @mbg.generated 2018-10-13
     */
    private Date created;

    /**
     * 更新时间
     *
     * @mbg.generated 2018-10-13
     */
    private Date updated;

    /**
     * 商品描述
     *
     * @mbg.generated 2018-10-13
     */
    private String itemDesc;

    /**
     * 商品ID
     * @return item_id 商品ID
     *
     * @mbg.generated 2018-10-13
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * 商品ID
     * @param itemId 商品ID
     *
     * @mbg.generated 2018-10-13
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * 创建时间
     * @return created 创建时间
     *
     * @mbg.generated 2018-10-13
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 创建时间
     * @param created 创建时间
     *
     * @mbg.generated 2018-10-13
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 更新时间
     * @return updated 更新时间
     *
     * @mbg.generated 2018-10-13
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 更新时间
     * @param updated 更新时间
     *
     * @mbg.generated 2018-10-13
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 商品描述
     * @return item_desc 商品描述
     *
     * @mbg.generated 2018-10-13
     */
    public String getItemDesc() {
        return itemDesc;
    }

    /**
     * 商品描述
     * @param itemDesc 商品描述
     *
     * @mbg.generated 2018-10-13
     */
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }
}