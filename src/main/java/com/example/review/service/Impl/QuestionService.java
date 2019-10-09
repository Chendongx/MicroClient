package com.example.review.service.Impl;

import com.example.review.dao.IQuestionMapper;
import com.example.review.pojo.ReviewQuestion;
import com.example.review.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class QuestionService implements IQuestionService {

    @Autowired
    IQuestionMapper iQuestionMapper;

    @Override
    public List<ReviewQuestion> findAll() {
        return iQuestionMapper.findAll();
    }

    @Override
    public ReviewQuestion findAllById(Integer ID) {
        return iQuestionMapper.findAllById(ID);
    }

    @Override
    public boolean addQuestion(ReviewQuestion reviewQuestion) {
        iQuestionMapper.addQuestion(reviewQuestion);
        return true;
        /*if (question != null){ return true; }
        return false;*/
    }

    @Override
    public boolean updateQuestion(ReviewQuestion reviewQuestion) {
        reviewQuestion.setModifyDate(new Date());
        iQuestionMapper.updateQuestion(reviewQuestion);
        return true;
    }

    @Override
    public boolean delQuestion(Integer ID) {
        iQuestionMapper.delQuestion(ID);
        ReviewQuestion question = iQuestionMapper.findAllById(ID);
        if (question == null) {return true;}
        return false;
    }

    @Override
    public List<ReviewQuestion> init(boolean isAll,String keyWord) {
        return iQuestionMapper.init(isAll ,keyWord);
    }

    @Override
    public List findType() {
        List list = iQuestionMapper.findType();
        return list;
    }
}
