package com.ssk.utils;

import com.ssk.pojo.Result;

import java.util.Objects;

/**
 * Created by Administrator on 2017/7/24 0024.
 */
public class ResponseResult {
    public static Result success(Object data){
        Result<Object> result = new Result<Object>();
        result.setCode(1);
        result.setMsg("请求成功");
        result.setData(data);
        return result;
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
