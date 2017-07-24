package com.ssk.service;

import com.ssk.dao.UserDao;
import com.ssk.enums.ResultEnum;
import com.ssk.exception.UserException;
import com.ssk.pojo.Result;
import com.ssk.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/7/24 0024.
 */
@Component
public class UserService {

    @Autowired
    private UserDao userDao;

    public void getAgeInfo(Integer id) throws UserException{
        User user = userDao.findOne(id);
        if (user.getAge() < 18){
            throw new UserException(ResultEnum.USER_AGE_ERROR);
        }
    }
}
