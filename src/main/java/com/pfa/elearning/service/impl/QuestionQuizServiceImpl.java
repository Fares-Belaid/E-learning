package com.pfa.elearning.service.impl;


import com.pfa.elearning.model.QuestionQuiz;
import com.pfa.elearning.repository.QuestionQuizRepository;
import com.pfa.elearning.service.IQuestionQuizService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Slf4j

public class QuestionQuizServiceImpl implements IQuestionQuizService {
    private final Logger log = LoggerFactory.getLogger(QuestionQuizServiceImpl.class);

    private final QuestionQuizRepository questionQuizRepository;

    @Autowired
    public QuestionQuizServiceImpl(QuestionQuizRepository questionQuizRepository) {
        this.questionQuizRepository = questionQuizRepository;
    }

    @Override
    public QuestionQuiz save(QuestionQuiz questionQuiz) {
        log.debug("Request to save QuestionQuiz : {}", questionQuiz);
        return questionQuizRepository.saveAndFlush(questionQuiz);
    }

    @Override
    public Optional<QuestionQuiz> partialUpdate(QuestionQuiz questionQuiz) {
        log.debug("Request to partially update QuestionQuiz : {}", questionQuiz);

        return questionQuizRepository
                .findById(questionQuiz.getId())
                .map(
                        existingQuestionQuiz -> {
                            if (questionQuiz.getTitre() != null) {
                                existingQuestionQuiz.setTitre(questionQuiz.getTitre());
                            }
                            if (questionQuiz.getDescription() != null) {
                                existingQuestionQuiz.setDescription(questionQuiz.getDescription());
                            }
                            if (questionQuiz.getQuestion() != null) {
                                existingQuestionQuiz.setQuestion(questionQuiz.getQuestion());
                            }
                            if (questionQuiz.getReponse() != null) {
                                existingQuestionQuiz.setReponse(questionQuiz.getReponse());
                            }
                            if (questionQuiz.getExplication() != null) {
                                existingQuestionQuiz.setExplication(questionQuiz.getExplication());
                            }

                            return existingQuestionQuiz;
                        }
                )
                .map(questionQuizRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<QuestionQuiz> findAll(Pageable pageable) {
        log.debug("Request to get all QuestionQuizs");
        return questionQuizRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<QuestionQuiz> findOne(Long id) {
        log.debug("Request to get QuestionQuiz : {}", id);
        return questionQuizRepository.findById(id);
    }

    @Override
    public boolean delete(Long id) {
        log.debug("Request to delete QuestionQuiz : {}", id);
        questionQuizRepository.deleteById(id);
        return false;
    }
}
