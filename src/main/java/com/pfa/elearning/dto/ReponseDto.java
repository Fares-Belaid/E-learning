package com.pfa.elearning.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ReponseDto {

	
	private Long idReponse;
	
	private String reponse;

	private QuestionQuizDto questionQuiz;
}
