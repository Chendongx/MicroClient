package com.example.review.dao;

import com.example.review.pojo.ReviewQuestion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可

@Mapper
@Repository
public interface IQuestionMapper {

    List<ReviewQuestion> findAll();

    ReviewQuestion findAllById(Integer ID);

    List<ReviewQuestion> init(@Param("isAll") boolean isAll,@Param("keyWord") String keyWord);

    void addQuestion(ReviewQuestion reviewQuestion);

    void updateQuestion(ReviewQuestion reviewQuestion);

    void delQuestion(@Param("id") Integer id);

    List findType();
}
