package com.example.review.service.Impl;

import com.example.review.pojo.ReviewAnswer;
import com.example.review.service.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService implements IAnswerService {

    @Autowired
    IAnswerService iAnswerService;

    @Override
    public List<ReviewAnswer> findAll() {
        return iAnswerService.findAll();
    }

    @Override
    public ReviewAnswer findAllById(Integer ID) {
        return iAnswerService.findAllById(ID);
    }
}
