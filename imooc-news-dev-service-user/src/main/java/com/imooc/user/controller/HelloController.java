package com.imooc.user.controller;

import com.imooc.api.controller.user.HelloControllerApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author honggw
 * @create 2022-01-05 17:26
 * @描述：
 */

@RestController
public class HelloController implements HelloControllerApi {
    public Object sayHello(){
        return "Hello";
    }
}
