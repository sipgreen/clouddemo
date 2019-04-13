package com.itcast.spdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Value("${server.port}")
    private String port;

    @GetMapping("/getPort")
    @ResponseBody
    public String getPort()
    {
        return "portfsdfsd:" + port + "rewfsdfsdrwer   fsdf";
    }

}