package com.pfa.elearning.service;

import java.util.List;
import java.util.Optional;

import com.pfa.elearning.model.QuestionQuiz;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IQuestionQuizService {

	QuestionQuiz save(QuestionQuiz questionQuiz);


	Optional<QuestionQuiz> partialUpdate(QuestionQuiz questionQuiz);

	List<QuestionQuiz> findAll();

	Optional<QuestionQuiz> findOne(Long id);

	boolean delete(Long id);
}
