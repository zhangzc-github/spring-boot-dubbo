package com.zhangzc.provider.service;


import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoSevice {
    @Override
    public String sayHello(String name) {
        return "hello! "+name;
    }
}
