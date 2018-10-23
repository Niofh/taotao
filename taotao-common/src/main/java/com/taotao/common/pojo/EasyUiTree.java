package com.taotao.common.pojo;

import java.io.Serializable;

/**
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/18 11:54
 */
public class EasyUiTree implements Serializable {
    private static final long serialVersionUID = 4631486721310748607L;
    private Long id;
    private String text;
    private String state; // false=open true=closed

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "EasyUiTree{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
