package com.janeliwl.home.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Liwl
 * @Description:
 * @Version: 2019/1/21 19:48 ,By Liwl
 **/
@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "hello," + name;
    }
}
