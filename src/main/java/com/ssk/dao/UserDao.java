package com.ssk.dao;

import com.ssk.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User,Integer>{
}
