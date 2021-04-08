package com.pfa.elearning.dto;

import java.util.List;



import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class QuizDto {

	
	private Long idQuiz;
	
	private String nom;

	private String description;

	private Integer scoreMin;

	private CoursDto cours;

	private List<QuestionQuizDto> questionQuizs;
}
