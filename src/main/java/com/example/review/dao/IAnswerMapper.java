package com.example.review.dao;

import com.example.review.pojo.ReviewAnswer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IAnswerMapper {
    List<ReviewAnswer> findAll();

    ReviewAnswer findAllById(Integer ID);
}
