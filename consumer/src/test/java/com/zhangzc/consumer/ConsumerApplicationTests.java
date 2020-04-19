package com.zhangzc.consumer;

import com.zhangzc.consumer.service.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerApplicationTests {
    @Autowired
    DemoService demoService;

    @Test
    void contextLoads() {
        demoService.sayHello("zhangzc");
    }

}
