package com.pfa.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elearning.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

}
