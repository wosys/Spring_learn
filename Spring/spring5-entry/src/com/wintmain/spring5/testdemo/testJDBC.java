package com.wintmain.spring5.testdemo;

import com.alibaba.druid.pool.DruidDataSource;
import com.wintmain.spring5.dao.DataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author wintmain    <wosintmain@gmail.com>
 * @Date 2022-03-18 20:56:23
 */
public class testJDBC {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_druid.xml");
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource.isKeepAlive());
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_druid.xml");
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        dataSource.test();
    }
}
