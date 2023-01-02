package com.wintmain._03_config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author wintmain    <wosintmain@gmail.com>
 * @Date 2023-01-02 14:26:04
 */
@RestController
public class UrlMapping {
    @Value("${person.lastName}")
    private String name;

    @RequestMapping("/")
    public String show(){
        return "Hello, "+name;
    }
}
