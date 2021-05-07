package com.pfa.elearning.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class QuestionQuiz {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String titre;

	@Column
	private String description;

	@Column
	private String question;
	
	@Column
	private String reponse;
	
	@Column
	private String explication;
	
	@ManyToOne
	private Quiz quiz;
	
	@OneToOne
	private Reponse reponse2;
}
