package com.pfa.elearning.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.Quiz;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class QuizDto {

	
	private Long idQuiz;
	
	private String nom;

	private String description;

	private Integer scoreMin;
	@JsonIgnore
	private CoursDto cours;
	@JsonIgnore
	private List<QuestionQuizDto> questionQuizs;
	

	public static QuizDto fromEntity(Quiz quiz) {
		if(quiz == null) {
			
			//to do throw an exception
			
		}
		
		return QuizDto.builder()
				.idQuiz(quiz.getIdQuiz())
				.nom(quiz.getNom())
				.description(quiz.getDescription())
				.scoreMin(quiz.getScoreMin())
				.build();
	}
	
	public static Quiz toEntity(QuizDto quizDto) {
		if(quizDto == null) {
			
			//to do throw an exception
			
		}
		
		Quiz quiz = new Quiz();
		quiz.setIdQuiz(quizDto.getIdQuiz());
		quiz.setNom(quizDto.getNom());
		quiz.setDescription(quizDto.getDescription());
		quiz.setScoreMin(quizDto.getScoreMin());
		
		return quiz;
	}
}
