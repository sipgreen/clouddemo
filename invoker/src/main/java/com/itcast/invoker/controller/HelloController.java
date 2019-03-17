package com.itcast.invoker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    DiscoveryClient client;

    @GetMapping("/getSPPort/{index}")
    @ResponseBody
    public String getService2Port(@PathVariable("index") int index)
    {
        String spdemo = "spdemo";
//        List<ServiceInstance> instancesById = client.getInstances(spdemo);
//        ServiceInstance instanceInfo = instancesById.get(index);
        String url = "http://"+spdemo;//"http://"+ instanceInfo.getHost()+":"+instanceInfo.getPort();
        String rest = restTemplate.getForObject(url + "/getPort", String.class);
        System.out.println(rest);
        return   "port:  " + rest + "  @"+url;
    }
}
