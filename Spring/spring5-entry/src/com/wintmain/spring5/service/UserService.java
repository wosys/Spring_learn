package com.wintmain.spring5.service;

import com.wintmain.spring5.dao.UserDao;

/**
 * @Description
 * @Author wintmain    <wosintmain@gmail.com>
 * @Date 2022-03-17 21:44:15
 */
public class UserService {

    //创建UserDao类型属性，生成set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add...");
        userDao.update();
    }
}
