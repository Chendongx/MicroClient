package com.example.review.controller;

import com.example.review.pojo.ReviewQuestion;
import com.example.review.service.IQuestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private static final Logger logger = LoggerFactory.getLogger(QuestionController.class);

    @Autowired
    IQuestionService iQuestionService;

    @GetMapping(value = "/test")
    public String questionTest(){
        return "success";
    }

    @PostMapping(value = "")
    public boolean addQuestion(@RequestBody ReviewQuestion reviewQuestion){
        logger.info("add"+reviewQuestion.getId());
        return iQuestionService.addQuestion(reviewQuestion);
    }

    @PutMapping(value = "")
    public boolean updQuestion(@RequestBody ReviewQuestion reviewQuestion){
        logger.info("put"+reviewQuestion.getId());
        return iQuestionService.updateQuestion(reviewQuestion);
    }

    @DeleteMapping(value = "")
    public boolean delQuestion(@RequestBody ReviewQuestion reviewQuestion){
       logger.info("delete"+reviewQuestion.getId());
       return iQuestionService.delQuestion(reviewQuestion.getId());
    }

    @GetMapping(value = "{id}")
    public ReviewQuestion findQuestionById(@PathVariable("id") String id){
        logger.info("get"+id);
        ReviewQuestion reviewQuestion = iQuestionService.findAllById( Integer.parseInt(id) );
        return reviewQuestion;
    }

    @GetMapping(value = "/finds")
    public List<ReviewQuestion> findsQuestion(){
        logger.info("get All");
        List<ReviewQuestion> questions = iQuestionService.findAll();
        return questions;
    }

    @GetMapping(value = "/init")
    public List<ReviewQuestion> init(@RequestParam("isAll") boolean isAll,
                                     @RequestParam("keyWord") String keyWord){
        logger.info("init 4");
        List<ReviewQuestion> questions = iQuestionService.init(isAll,keyWord);
        return questions;
    }

    @GetMapping(value = "/getType")
    public List getType(){
        return iQuestionService.findType();
    }
}
