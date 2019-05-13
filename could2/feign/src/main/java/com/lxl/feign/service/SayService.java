package com.lxl.feign.service;

import com.lxl.feign.service.hystric.SayServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client",fallback = SayServiceHystric.class)
public interface SayService {

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name",defaultValue = "aiwanren") String name);
}
