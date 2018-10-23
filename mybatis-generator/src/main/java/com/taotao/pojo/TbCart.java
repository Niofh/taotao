package com.taotao.pojo;

import java.util.Date;

/**
 *  TABLE 2018-10-13
 */
public class TbCart {
    /**
     * 自增ID
     *
     * @mbg.generated 2018-10-13
     */
    private Long id;

    /**
     * 用户ID
     *
     * @mbg.generated 2018-10-13
     */
    private Long userId;

    /**
     * 商品ID
     *
     * @mbg.generated 2018-10-13
     */
    private Long itemId;

    /**
     * 商品标题
     *
     * @mbg.generated 2018-10-13
     */
    private String itemTitle;

    /**
     * 商品主图
     *
     * @mbg.generated 2018-10-13
     */
    private String itemImage;

    /**
     * 商品价格，单位为：分
     *
     * @mbg.generated 2018-10-13
     */
    private Long itemPrice;

    /**
     * 购买数量
     *
     * @mbg.generated 2018-10-13
     */
    private Integer num;

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
     * 自增ID
     * @return id 自增ID
     *
     * @mbg.generated 2018-10-13
     */
    public Long getId() {
        return id;
    }

    /**
     * 自增ID
     * @param id 自增ID
     *
     * @mbg.generated 2018-10-13
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户ID
     * @return user_id 用户ID
     *
     * @mbg.generated 2018-10-13
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     *
     * @mbg.generated 2018-10-13
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

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
     * 商品标题
     * @return item_title 商品标题
     *
     * @mbg.generated 2018-10-13
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * 商品标题
     * @param itemTitle 商品标题
     *
     * @mbg.generated 2018-10-13
     */
    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle == null ? null : itemTitle.trim();
    }

    /**
     * 商品主图
     * @return item_image 商品主图
     *
     * @mbg.generated 2018-10-13
     */
    public String getItemImage() {
        return itemImage;
    }

    /**
     * 商品主图
     * @param itemImage 商品主图
     *
     * @mbg.generated 2018-10-13
     */
    public void setItemImage(String itemImage) {
        this.itemImage = itemImage == null ? null : itemImage.trim();
    }

    /**
     * 商品价格，单位为：分
     * @return item_price 商品价格，单位为：分
     *
     * @mbg.generated 2018-10-13
     */
    public Long getItemPrice() {
        return itemPrice;
    }

    /**
     * 商品价格，单位为：分
     * @param itemPrice 商品价格，单位为：分
     *
     * @mbg.generated 2018-10-13
     */
    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * 购买数量
     * @return num 购买数量
     *
     * @mbg.generated 2018-10-13
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 购买数量
     * @param num 购买数量
     *
     * @mbg.generated 2018-10-13
     */
    public void setNum(Integer num) {
        this.num = num;
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
}