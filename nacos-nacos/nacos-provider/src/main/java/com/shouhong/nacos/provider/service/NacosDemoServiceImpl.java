package com.shouhong.nacos.provider.service;

import com.shouhong.nacos.api.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author shouhong
 */
@Slf4j
@Service(version = "${demo.service.version}", group = "${demo.service.group}")
public class NacosDemoServiceImpl implements DemoService {


    @Value("${spring.application.name}")
    private String applicationName;

    public String sayHello(String name) {
        log.info("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        log.info("$$$$This is from Nacos provider!$$$$");
        log.info("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        return String.format("[%s] : Hello, %s", applicationName, name);
    }
}
