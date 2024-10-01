package com.nour.quiz_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nour.quiz_app.models.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

}
