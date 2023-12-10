package com.wintmain.spring5.test;

import com.wintmain.spring5.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description
 * @Author wintmain    <wosintmain@gmail.com>
 * @Date 2022-03-26 16:50:29
 */

@RunWith(SpringJUnit4ClassRunner.class)//单元测试框架
@ContextConfiguration("classpath:bean.xml")//加载配置文件
public class JTest4 {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        userService.accountMoney();
    }
}
