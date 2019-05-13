package com.lxl.ribbon.controller;

import com.lxl.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Email miles02@163.com
 *
 * @author fangzhipeng
 * create 2018-07-09
 **/
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/info")
    public String hi(@RequestParam(value = "name", defaultValue = "aiwanren") String name) {
        return helloService.hiService( name );
    }
}