package com.zhangzc.consumer.service;

import com.zhangzc.provider.service.DemoSevice;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Reference
    DemoSevice demoSevice;

    public void sayHello(String name){
        System.out.println(demoSevice.sayHello(name));
    }
}
