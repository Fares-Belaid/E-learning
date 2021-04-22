package com.pfa.elearning.service;

import java.util.List;

import com.pfa.elearning.dto.QuizDto;

public interface IQuizService {
	
	QuizDto save(QuizDto dto);
	
	QuizDto findById(Long id);
	
	QuizDto findByNom(String nom);
	
	List<QuizDto> findAll();
	
	void delete(Long id);
}
