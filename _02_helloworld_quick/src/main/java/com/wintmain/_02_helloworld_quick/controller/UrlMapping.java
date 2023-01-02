package com.wintmain._02_helloworld_quick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author wintmain    <wosintmain@gmail.com>
 * @Date 2023-01-02 13:42:39
 */

@Controller
public class UrlMapping {

    @ResponseBody
    @RequestMapping("/")
    public String hello(){
        return "Using Spring Starter Project";
    }
}
