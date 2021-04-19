package com.pfa.elearning.service;

import java.util.List;

import com.pfa.elearning.dto.QuestionQuizDto;

public interface IQuestionQuizService {

	QuestionQuizDto save(QuestionQuizDto dto);
	
	QuestionQuizDto findById(Long id);
	
	List<QuestionQuizDto> findAll();
	
	void delete(Long id);
}
