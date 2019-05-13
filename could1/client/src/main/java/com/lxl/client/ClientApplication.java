package com.lxl.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run( ClientApplication.class, args );
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/info")
    public String home(@RequestParam(value = "name", defaultValue = "aiwanren") String name) {
        return "Hello" +":"+ name +"!"+"  "+ " I am from port:" + port;
    }



}



