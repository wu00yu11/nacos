package com.learn.nacos.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: nacos
 * @description:
 * @author: zjj
 * @create: 2019-12-30 16:26
 **/
@RestController
public class TestController {

    @GetMapping("/echo")
    public String echo(){
        System.out.println("echo-----------");
        return "00";
    }
}
