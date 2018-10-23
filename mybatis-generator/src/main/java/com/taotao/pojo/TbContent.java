package com.taotao.pojo;

import java.util.Date;

/**
 *  TABLE 2018-10-13
 */
public class TbContent {
    /**
     * 
     *
     * @mbg.generated 2018-10-13
     */
    private Long id;

    /**
     * 内容类目ID
     *
     * @mbg.generated 2018-10-13
     */
    private Long categoryId;

    /**
     * 内容标题
     *
     * @mbg.generated 2018-10-13
     */
    private String title;

    /**
     * 子标题
     *
     * @mbg.generated 2018-10-13
     */
    private String subTitle;

    /**
     * 标题描述
     *
     * @mbg.generated 2018-10-13
     */
    private String titleDesc;

    /**
     * 链接
     *
     * @mbg.generated 2018-10-13
     */
    private String url;

    /**
     * 图片绝对路径
     *
     * @mbg.generated 2018-10-13
     */
    private String pic;

    /**
     * 图片2
     *
     * @mbg.generated 2018-10-13
     */
    private String pic2;

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
     * 内容
     *
     * @mbg.generated 2018-10-13
     */
    private String content;

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
     * 内容类目ID
     * @return category_id 内容类目ID
     *
     * @mbg.generated 2018-10-13
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 内容类目ID
     * @param categoryId 内容类目ID
     *
     * @mbg.generated 2018-10-13
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 内容标题
     * @return title 内容标题
     *
     * @mbg.generated 2018-10-13
     */
    public String getTitle() {
        return title;
    }

    /**
     * 内容标题
     * @param title 内容标题
     *
     * @mbg.generated 2018-10-13
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 子标题
     * @return sub_title 子标题
     *
     * @mbg.generated 2018-10-13
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * 子标题
     * @param subTitle 子标题
     *
     * @mbg.generated 2018-10-13
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * 标题描述
     * @return title_desc 标题描述
     *
     * @mbg.generated 2018-10-13
     */
    public String getTitleDesc() {
        return titleDesc;
    }

    /**
     * 标题描述
     * @param titleDesc 标题描述
     *
     * @mbg.generated 2018-10-13
     */
    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc == null ? null : titleDesc.trim();
    }

    /**
     * 链接
     * @return url 链接
     *
     * @mbg.generated 2018-10-13
     */
    public String getUrl() {
        return url;
    }

    /**
     * 链接
     * @param url 链接
     *
     * @mbg.generated 2018-10-13
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 图片绝对路径
     * @return pic 图片绝对路径
     *
     * @mbg.generated 2018-10-13
     */
    public String getPic() {
        return pic;
    }

    /**
     * 图片绝对路径
     * @param pic 图片绝对路径
     *
     * @mbg.generated 2018-10-13
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * 图片2
     * @return pic2 图片2
     *
     * @mbg.generated 2018-10-13
     */
    public String getPic2() {
        return pic2;
    }

    /**
     * 图片2
     * @param pic2 图片2
     *
     * @mbg.generated 2018-10-13
     */
    public void setPic2(String pic2) {
        this.pic2 = pic2 == null ? null : pic2.trim();
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
     * 内容
     * @return content 内容
     *
     * @mbg.generated 2018-10-13
     */
    public String getContent() {
        return content;
    }

    /**
     * 内容
     * @param content 内容
     *
     * @mbg.generated 2018-10-13
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}