package com.pfa.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elearning.model.QuestionQuiz;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionQuizRepository extends JpaRepository<QuestionQuiz, Long> {

}
