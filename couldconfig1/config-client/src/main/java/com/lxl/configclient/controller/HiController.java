package com.lxl.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HiController {

    @Value("${foo}")
    private String foo;

    @Value("${democonfigclient.message}")
    private String message;

    @GetMapping(value = "/hi")
    public String hi(){
        return foo+" "+message;
    }
}