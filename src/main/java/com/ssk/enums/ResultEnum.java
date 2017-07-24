package com.ssk.enums;

/**
 * Created by Administrator on 2017/7/24 0024.
 */
public enum ResultEnum {
    USER_AGE_ERROR(100,"未成年")
    ;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
