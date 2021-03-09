package com.shouhong.nacos.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shouhong.nacos.api.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shouhong
 */
@RestController
public class DemoController {
    @Reference(version = "${demo.service.version}", group = "${demo.service.group}")
    private DemoService zookeeperDemoService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return zookeeperDemoService.sayHello("This is from Nacos to Nacos Sync !");

    }
}
