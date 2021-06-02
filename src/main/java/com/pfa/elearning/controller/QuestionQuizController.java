package com.pfa.elearning.controller;


import com.pfa.elearning.model.QuestionQuiz;
import com.pfa.elearning.service.IQuestionQuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/questionQuiz")
public class QuestionQuizController {
    @Autowired
    private IQuestionQuizService questionQuizService ;


    @GetMapping("/")
    @ResponseBody
    public List<QuestionQuiz> getAllQuestionquiz(){
        return questionQuizService.findAll();
    }

    @GetMapping("/find")
    public Optional<QuestionQuiz> getQuestionquiz(@RequestParam Long id) {
        return questionQuizService.findOne(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public QuestionQuiz addQuestionquiz(@RequestBody QuestionQuiz questionQuiz) {
        return questionQuizService.save(questionQuiz);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteQuestionquiz(@RequestParam Long id) {

        return questionQuizService.delete(id);
    }

    @PutMapping("/update")
    public Optional<QuestionQuiz> updateQuestionquiz(@RequestBody QuestionQuiz questionQuiz) {

        return questionQuizService.partialUpdate(questionQuiz);
    }
}
