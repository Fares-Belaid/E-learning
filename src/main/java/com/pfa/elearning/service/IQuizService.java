package com.pfa.elearning.service;

import java.util.List;
import java.util.Optional;

import com.pfa.elearning.model.Quiz;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IQuizService {

	Quiz save(Quiz quiz);

	Optional<Quiz> partialUpdate(Quiz quiz);

	List<Quiz> findAll();

	Optional<Quiz> findOne(Long id);

	boolean delete(Long id);
}
