package com.ssk.controller;

import com.ssk.dao.UserDao;
import com.ssk.exception.UserException;
import com.ssk.pojo.Result;
import com.ssk.pojo.User;
import com.ssk.service.UserService;
import com.ssk.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserService userService;


    @RequestMapping("info/{id}")
    public User info(@PathVariable("id") Integer id){
        return userDao.findOne(id);
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public Result insert(@Valid User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResponseResult.error(0,bindingResult.getFieldError().getDefaultMessage());
        }
        return ResponseResult.success(userDao.save(user));
    }

    //获取年龄信息
    @RequestMapping(value = "ageInfo/{id}",method = RequestMethod.GET)
    public void ageInfo(@PathVariable("id") Integer id) throws UserException{
        userService.getAgeInfo(id);
    }

}
