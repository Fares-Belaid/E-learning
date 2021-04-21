package com.pfa.elearning.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.elearning.dto.QuizDto;
import com.pfa.elearning.exception.EntityNotFoundException;
import com.pfa.elearning.exception.ErrorCodes;
import com.pfa.elearning.exception.InvalidEntityException;
import com.pfa.elearning.model.Quiz;
import com.pfa.elearning.repository.QuizRepository;
import com.pfa.elearning.service.IQuizService;
import com.pfa.elearning.validator.QuizValidator;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class QuizServiceImpl implements IQuizService {

	@Autowired
	private QuizRepository quizRepository;
	
	@Override
	public QuizDto save(QuizDto dto) {
		List<String> errors = QuizValidator.validate(dto);
		if(!errors.isEmpty()) {
			log.error("quiz not valid",dto);
			throw new InvalidEntityException("Le quiz n'est pas valide", ErrorCodes.QUIZ_NOT_VALID,errors);
		}
		return QuizDto.fromEntity(quizRepository.save(QuizDto.toEntity(dto)));
	}

	@Override
	public QuizDto findById(Long id) {
		if(id== null) {
			log.error("Quiz id is null");
			return null;
		}
		Optional <Quiz> quiz = quizRepository.findById(id);
		
		QuizDto dto = QuizDto.fromEntity(quiz.get());
		
		return Optional.of(dto).orElseThrow(() ->
			new EntityNotFoundException(
					"Aucun quiz avec l'id = "+ id + " n'ete touve dans la BD",
					ErrorCodes.QUIZ_NOT_FOUND));
	}

	@Override
	public List<QuizDto> findAll() {
		return quizRepository.findAll().stream().map(QuizDto::fromEntity).collect(Collectors.toList());

	}

	@Override
	public void delete(Long id) {
		if (id == null) {
			log.error("quiz id is null");
			return ;
		}
		quizRepository.deleteById(id);
		
	}

}
