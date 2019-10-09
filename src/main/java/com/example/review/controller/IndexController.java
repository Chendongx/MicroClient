package com.example.review.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/login")
    public String toLogin(){
        return "login";
    }

    @RequestMapping(value = "/index")
    public String toIndex(){
        return "index";
    }

    @RequestMapping(value = "/question")
    public String toQuestion(){
        return "review/question";
    }
}
