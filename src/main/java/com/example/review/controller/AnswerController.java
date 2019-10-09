package com.example.review.controller;

import com.example.review.pojo.ReviewAnswer;
import com.example.review.service.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Answer")
public class AnswerController {

    @Autowired
    IAnswerService iAnswerService;

    @GetMapping(value = "/find")
    public ReviewAnswer findQuestionById(Integer Id){
        ReviewAnswer reviewAnswer = iAnswerService.findAllById(Id);
        return reviewAnswer;
    }

    @GetMapping(value = "/finds")
    public List<ReviewAnswer> findsQuestion(){
        List<ReviewAnswer> answers = iAnswerService.findAll();
        return answers;
    }
}
