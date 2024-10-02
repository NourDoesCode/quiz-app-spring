package com.nour.quiz_app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nour.quiz_app.models.Question;
import com.nour.quiz_app.services.QuestionService;

@RestController
// domain.com/question
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    public List<Question> getQuestionsByCategory() {
        return questionService.getQuestionsByCategory();
    }

}
