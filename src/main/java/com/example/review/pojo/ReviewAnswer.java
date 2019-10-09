package com.example.review.pojo;


import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class ReviewAnswer {

  private long id;
  private String answer;
  private String lastAnswer;
  private java.sql.Timestamp creationDate;
  private java.sql.Timestamp modifyDate;
  private long questionId;

  public void ReviewQuestion(){}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }


  public String getLastAnswer() {
    return lastAnswer;
  }

  public void setLastAnswer(String lastAnswer) {
    this.lastAnswer = lastAnswer;
  }


  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }


  public Date getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(java.sql.Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }


  public long getQuestionId() {
    return questionId;
  }

  public void setQuestionId(long questionId) {
    this.questionId = questionId;
  }

}
