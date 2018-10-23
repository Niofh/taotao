package com.taotao.pojo;

/**
 *  TABLE 2018-10-13
 */
public class TbOrderItem {
    /**
     * 商品id
     *
     * @mbg.generated 2018-10-13
     */
    private String itemId;

    /**
     * 订单id
     *
     * @mbg.generated 2018-10-13
     */
    private String orderId;

    /**
     * 商品购买数量
     *
     * @mbg.generated 2018-10-13
     */
    private Integer num;

    /**
     * 商品标题
     *
     * @mbg.generated 2018-10-13
     */
    private String title;

    /**
     * 商品单价
     *
     * @mbg.generated 2018-10-13
     */
    private Long price;

    /**
     * 商品总金额
     *
     * @mbg.generated 2018-10-13
     */
    private Long totalFee;

    /**
     * 商品图片地址
     *
     * @mbg.generated 2018-10-13
     */
    private String picPath;

    /**
     * 商品id
     * @return item_id 商品id
     *
     * @mbg.generated 2018-10-13
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 商品id
     * @param itemId 商品id
     *
     * @mbg.generated 2018-10-13
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 订单id
     * @return order_id 订单id
     *
     * @mbg.generated 2018-10-13
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 订单id
     * @param orderId 订单id
     *
     * @mbg.generated 2018-10-13
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * 商品购买数量
     * @return num 商品购买数量
     *
     * @mbg.generated 2018-10-13
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 商品购买数量
     * @param num 商品购买数量
     *
     * @mbg.generated 2018-10-13
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 商品标题
     * @return title 商品标题
     *
     * @mbg.generated 2018-10-13
     */
    public String getTitle() {
        return title;
    }

    /**
     * 商品标题
     * @param title 商品标题
     *
     * @mbg.generated 2018-10-13
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 商品单价
     * @return price 商品单价
     *
     * @mbg.generated 2018-10-13
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 商品单价
     * @param price 商品单价
     *
     * @mbg.generated 2018-10-13
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 商品总金额
     * @return total_fee 商品总金额
     *
     * @mbg.generated 2018-10-13
     */
    public Long getTotalFee() {
        return totalFee;
    }

    /**
     * 商品总金额
     * @param totalFee 商品总金额
     *
     * @mbg.generated 2018-10-13
     */
    public void setTotalFee(Long totalFee) {
        this.totalFee = totalFee;
    }

    /**
     * 商品图片地址
     * @return pic_path 商品图片地址
     *
     * @mbg.generated 2018-10-13
     */
    public String getPicPath() {
        return picPath;
    }

    /**
     * 商品图片地址
     * @param picPath 商品图片地址
     *
     * @mbg.generated 2018-10-13
     */
    public void setPicPath(String picPath) {
        this.picPath = picPath == null ? null : picPath.trim();
    }
}