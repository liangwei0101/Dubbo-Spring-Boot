package com.liangwei.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.liangwei.api.service.DemoService;

/**
 * DemoServiceImpl
 * 服务提供类
 * @author liangwei
 * @date 2019/1/29
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }
}
