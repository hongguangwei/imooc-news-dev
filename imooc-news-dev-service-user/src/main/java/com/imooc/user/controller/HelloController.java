package com.imooc.user.controller;

import com.imooc.api.controller.user.HelloControllerApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author honggw
 * @create 2022-01-05 17:26
 * @描述：
 */

@RestController
public class HelloController implements HelloControllerApi {
    public Object sayHello(){
        final Logger logger = LoggerFactory.getLogger(HelloController.class);
         logger.debug("debug");
         logger.info("info");
         logger.warn("warn");
         logger.error("error");
        return "Hello";
    }
}
