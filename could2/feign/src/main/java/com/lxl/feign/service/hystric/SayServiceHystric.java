package com.lxl.feign.service.hystric;

import com.lxl.feign.service.SayService;
import org.springframework.stereotype.Component;

@Component
public class SayServiceHystric implements SayService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry---"+name;
    }
}