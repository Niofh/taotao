package com.taotao.dto;

import java.io.Serializable;

/**
 * 富文本编辑器上传文件格式
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/22 14:03
 */
public class KindEditorJson implements Serializable {
    private static final long serialVersionUID = 4631486721310748607L;
    private Integer error;
    private String message;
    private String url;


    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "KindEditorJson{" +
                "error=" + error +
                ", message='" + message + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
