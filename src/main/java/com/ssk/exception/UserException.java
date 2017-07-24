package com.ssk.exception;

import com.ssk.enums.ResultEnum;

/**
 * Created by Administrator on 2017/7/24 0024.
 */
public class UserException extends RuntimeException{
    private Integer code;

    public UserException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
