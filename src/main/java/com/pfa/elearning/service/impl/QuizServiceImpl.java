package com.pfa.elearning.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.pfa.elearning.model.Quiz;

import com.pfa.elearning.repository.QuizRepository;
import com.pfa.elearning.service.IQuizService;

import org.springframework.transaction.annotation.Transactional;

@Service


public class QuizServiceImpl implements IQuizService {

	private final Logger log = LoggerFactory.getLogger(QuizServiceImpl.class);

	private final QuizRepository quizRepository;

	@Autowired
	public QuizServiceImpl(QuizRepository quizRepository) {
		this.quizRepository = quizRepository;
	}

	@Override
	public Quiz save(Quiz quiz) {
		log.debug("Request to save Quiz : {}", quiz);
		return quizRepository.saveAndFlush(quiz);
	}

	@Override
	public Optional<Quiz> partialUpdate(Quiz quiz) {
		log.debug("Request to partially update Quiz : {}", quiz);

		return quizRepository
				.findById(quiz.getId())
				.map(
						existingQuiz -> {
							if (quiz.getTitre() != null) {
								existingQuiz.setTitre(quiz.getTitre());
							}
							if (quiz.getDescription() != null) {
								existingQuiz.setDescription(quiz.getDescription());
							}
							if (quiz.getScoreMin() != null) {
								existingQuiz.setScoreMin(quiz.getScoreMin());
							}

							return existingQuiz;
						}
				)
				.map(quizRepository::save);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Quiz> findAll() {
		log.debug("Request to get all Quizzes");
		return quizRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Quiz> findOne(Long id) {
		log.debug("Request to get Quiz : {}", id);
		return quizRepository.findById(id);
	}

	@Override
	public boolean delete(Long id) {
		log.debug("Request to delete Quiz : {}", id);
		quizRepository.deleteById(id);
        return false;
    }

}
