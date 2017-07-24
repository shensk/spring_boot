package com.ssk.exception;

import com.ssk.pojo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/7/24 0024.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    //    @ExceptionHandler(value={RuntimeException.class,MyRuntimeException.class})
    //    @ExceptionHandler//处理所有异常
    @ResponseBody //在返回自定义相应类的情况下必须有，这是@ControllerAdvice注解的规定
    public Result exceptionHandler(RuntimeException e, HttpServletResponse response) {
        Result result = new Result();
        if (e instanceof UserException){
            UserException exception = (UserException)e;
            result.setCode(exception.getCode());
            result.setMsg(exception.getMessage());
            return result;
        }
        result.setCode(-1);
        result.setMsg("未知错误");
        return result;
    }
}
