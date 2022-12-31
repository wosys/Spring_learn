package org.wintmain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author wintmain    <wosintmain@gmail.com>
 * @Date 2022-12-31 20:35:38
 */

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello, SpringBoot";
    }
}
