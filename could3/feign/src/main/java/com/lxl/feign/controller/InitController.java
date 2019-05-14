package com.lxl.feign.controller;

import com.lxl.feign.service.SayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

    @Autowired
    SayService sayService;

    @GetMapping(value = "/info")
    public String sayHi(@RequestParam(value = "name", defaultValue = "aiwanren") String name) {
        return sayService.sayHiFromClientOne( name );
    }

}
