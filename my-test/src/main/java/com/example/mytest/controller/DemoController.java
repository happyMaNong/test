package com.example.mytest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: DemoController
 * @description:
 * @author: tianlingpeng
 * @create: 2019-10-19 17:19
 */
@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello jenkins";
    }
}
