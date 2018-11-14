package com.wx.islandweb.result;

/**
 * 定义一个统一的返回格式
 * 统一把Result作为一个结果返回给前端
 */
public class Result {
    private int code;
    private boolean success;
    private Object data;

    public Result(int code, boolean success, Object data) {
        this.code = code;
        this.success = success;
        this.data = data;
    }
    public Result(){}

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
