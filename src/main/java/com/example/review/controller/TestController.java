package com.example.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    //Eureka 服务
    /*@Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/consumer")
    public Object getInfo(){
        //调用其他工程服务，得到数据再返回
        Object forObject = restTemplate.getForObject("http://SERVICE-CLIENT/buy",Object.class);
        System.out.println( forObject.toString() );
        return forObject;
    }
     */
    @RequestMapping(value = "/test")
    public String tets(){
        return "login";
    }
}
