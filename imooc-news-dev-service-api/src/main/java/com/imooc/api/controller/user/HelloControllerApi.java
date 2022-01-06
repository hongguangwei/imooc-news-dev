package com.imooc.api.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author honggw
 * @create 2022-01-05 17:26
 * @描述：
 */
public interface HelloControllerApi {
    @GetMapping("sayHello")
    public Object sayHello();
}
