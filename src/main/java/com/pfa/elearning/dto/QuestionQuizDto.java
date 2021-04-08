package com.pfa.elearning.dto;



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

	private QuizDto quiz;

	private ReponseDto reponse2;
}
