package com.pfa.elearning.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.Reponse;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ReponseDto {

	
	private Long idReponse;
	
	private String reponse;

	@JsonIgnore
	private QuestionQuizDto questionQuiz;
	
	
	public static ReponseDto fromEntity(Reponse reponse) {
		if(reponse == null) {
			
			//to do throw an exception
			
		}
		
		return ReponseDto.builder()
				.idReponse(reponse.getIdReponse())
				.reponse(reponse.getReponse())
				.build();
	}
	
	public static Reponse toEntity(ReponseDto reponseDto) {
		if(reponseDto == null) {
			
			//to do throw an exception
			
		}
		
		Reponse reponse = new Reponse();
		reponse.setIdReponse(reponseDto.getIdReponse());
		reponse.setReponse(reponseDto.getReponse());

		return reponse;
	}
}
