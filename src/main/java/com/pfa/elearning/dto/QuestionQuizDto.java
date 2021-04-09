package com.pfa.elearning.dto;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.QuestionQuiz;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class QuestionQuizDto {

	
	private Long id;
	
	private String titre;

	private String question;

	private String reponse;

	private String explication;
	@JsonIgnore
	private QuizDto quiz;
	@JsonIgnore
	private ReponseDto reponse2;
	
	
	public static QuestionQuizDto fromEntity(QuestionQuiz questionQuiz) {
		if(questionQuiz == null) {
			
			//to do throw an exception
			
		}
		
		return QuestionQuizDto.builder()
				.id(questionQuiz.getId())
				.titre(questionQuiz.getTitre())
				.question(questionQuiz.getQuestion())
				.reponse(questionQuiz.getReponse())
				.explication(questionQuiz.getExplication())
				.build();
	}
	
	public static QuestionQuiz toEntity(QuestionQuizDto questionQuizDto) {
		if(questionQuizDto == null) {
			
			//to do throw an exception
			
		}
		
		QuestionQuiz questionQuiz = new QuestionQuiz();
		questionQuiz.setId(questionQuizDto.getId());
		questionQuiz.setTitre(questionQuizDto.getTitre());
		questionQuiz.setQuestion(questionQuizDto.getQuestion());
		questionQuiz.setReponse(questionQuizDto.getReponse());
		questionQuiz.setExplication(questionQuizDto.getExplication());
		
		return questionQuiz;
	}
}
