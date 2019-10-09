package com.example.review.service;

import com.example.review.pojo.ReviewAnswer;

import java.util.List;

public interface IAnswerService {
    List<ReviewAnswer> findAll();

    ReviewAnswer findAllById(Integer ID);
}
