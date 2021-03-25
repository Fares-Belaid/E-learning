package com.pfa.elearning.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Quiz {

	private Long idQuiz;
	
	private String question;
	
	private String goal;
	
	private Integer scoreMin;
	
	@ManyToMany
	private Cours cours;
}
