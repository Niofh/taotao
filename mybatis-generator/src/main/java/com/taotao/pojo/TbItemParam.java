package com.taotao.pojo;

import java.util.Date;

/**
 *  TABLE 2018-10-13
 */
public class TbItemParam {
    /**
     * 
     *
     * @mbg.generated 2018-10-13
     */
    private Long id;

    /**
     * 商品类目ID
     *
     * @mbg.generated 2018-10-13
     */
    private Long itemCatId;

    /**
     * 
     *
     * @mbg.generated 2018-10-13
     */
    private Date created;

    /**
     * 
     *
     * @mbg.generated 2018-10-13
     */
    private Date updated;

    /**
     * 参数数据，格式为json格式
     *
     * @mbg.generated 2018-10-13
     */
    private String paramData;

    /**
     * 
     * @return id 
     *
     * @mbg.generated 2018-10-13
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id 
     *
     * @mbg.generated 2018-10-13
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 商品类目ID
     * @return item_cat_id 商品类目ID
     *
     * @mbg.generated 2018-10-13
     */
    public Long getItemCatId() {
        return itemCatId;
    }

    /**
     * 商品类目ID
     * @param itemCatId 商品类目ID
     *
     * @mbg.generated 2018-10-13
     */
    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
    }

    /**
     * 
     * @return created 
     *
     * @mbg.generated 2018-10-13
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 
     * @param created 
     *
     * @mbg.generated 2018-10-13
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 
     * @return updated 
     *
     * @mbg.generated 2018-10-13
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * 
     * @param updated 
     *
     * @mbg.generated 2018-10-13
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 参数数据，格式为json格式
     * @return param_data 参数数据，格式为json格式
     *
     * @mbg.generated 2018-10-13
     */
    public String getParamData() {
        return paramData;
    }

    /**
     * 参数数据，格式为json格式
     * @param paramData 参数数据，格式为json格式
     *
     * @mbg.generated 2018-10-13
     */
    public void setParamData(String paramData) {
        this.paramData = paramData == null ? null : paramData.trim();
    }
}