package com.pfa.elearning.controller;

import com.pfa.elearning.model.Quiz;
import com.pfa.elearning.service.IQuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private IQuizService quizService ;


    @GetMapping("/")
    @ResponseBody
    public Page<Quiz> getAllQuiz(@RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "5") int size){
        return quizService.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/find")
    public Optional<Quiz> getQuiz(@RequestParam Long id) {
        return quizService.findOne(id);
    }

    @PostMapping("/add")
    @ResponseBody
    public Quiz addQuiz(@RequestBody Quiz quiz) {
        return quizService.save(quiz);
    }

    @DeleteMapping("/remove")
    @ResponseBody
    public boolean deleteQuiz(@RequestParam Long id) {

        return quizService.delete(id);
    }

    @PutMapping("/update")
    public Optional<Quiz> updateQuiz(@RequestBody Quiz quiz) {

        return quizService.partialUpdate(quiz);
    }
}
