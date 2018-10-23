package com.taotao.pojo;

import java.util.Date;

/**
 *  TABLE 2018-10-13
 */
public class TbUser {
    /**
     * 
     *
     * @mbg.generated 2018-10-13
     */
    private Long id;

    /**
     * 用户名
     *
     * @mbg.generated 2018-10-13
     */
    private String username;

    /**
     * 密码，加密存储
     *
     * @mbg.generated 2018-10-13
     */
    private String password;

    /**
     * 注册手机号
     *
     * @mbg.generated 2018-10-13
     */
    private String phone;

    /**
     * 注册邮箱
     *
     * @mbg.generated 2018-10-13
     */
    private String email;

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
     * 用户名
     * @return username 用户名
     *
     * @mbg.generated 2018-10-13
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     * @param username 用户名
     *
     * @mbg.generated 2018-10-13
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 密码，加密存储
     * @return password 密码，加密存储
     *
     * @mbg.generated 2018-10-13
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码，加密存储
     * @param password 密码，加密存储
     *
     * @mbg.generated 2018-10-13
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 注册手机号
     * @return phone 注册手机号
     *
     * @mbg.generated 2018-10-13
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 注册手机号
     * @param phone 注册手机号
     *
     * @mbg.generated 2018-10-13
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 注册邮箱
     * @return email 注册邮箱
     *
     * @mbg.generated 2018-10-13
     */
    public String getEmail() {
        return email;
    }

    /**
     * 注册邮箱
     * @param email 注册邮箱
     *
     * @mbg.generated 2018-10-13
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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