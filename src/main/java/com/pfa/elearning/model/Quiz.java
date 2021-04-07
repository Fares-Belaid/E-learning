package com.pfa.elearning.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Quiz {

	private Long idQuiz;
	
	private String nom;
	
	private String description;
	
	private Integer scoreMin;
	
	@ManyToMany
	private Cours cours;
	
	@OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
	private List<QuestionQuiz> questionQuizs;
}
