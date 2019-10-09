package com.example.review.service;

import com.example.review.pojo.ReviewQuestion;

import java.util.List;


public interface IQuestionService {
    List<ReviewQuestion> findAll();

    ReviewQuestion findAllById(Integer ID);

    boolean addQuestion(ReviewQuestion reviewQuestion);

    boolean updateQuestion(ReviewQuestion reviewQuestion);

    boolean delQuestion(Integer ID);

    List<ReviewQuestion> init(boolean isAll,String keyWord);

    List findType();
}
