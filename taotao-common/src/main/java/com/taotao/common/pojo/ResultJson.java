package com.taotao.common.pojo;

import java.io.Serializable;

/**
 * Json数据返回格式
 *
 * @Description:
 * @Author: Nicofh
 * @Date: 2018/10/22 14:52
 */

public class ResultJson implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final int SUCCESS = 200;
    public static final int ERROR = 500;

    private Integer status;
    private String message;
    private Object data;


    public static ResultJson success() {
        return new ResultJson(SUCCESS);
    }

    public static ResultJson success(String message, Object data) {
        return new ResultJson(SUCCESS, message, data);
    }

    public static ResultJson error(String message, Object data) {
        return new ResultJson(ERROR, message, data);
    }

    public ResultJson() {
    }

    public ResultJson(Integer status) {
        this.status = status;
    }

    public ResultJson(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }




    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultJson{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
