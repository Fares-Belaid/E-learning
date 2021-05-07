package com.pfa.elearning.model;




import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Reponse {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idReponse;
	
	@Column
	private String correction;
	
	@OneToOne(mappedBy = "reponse2", cascade = CascadeType.ALL)
	private QuestionQuiz questionQuiz;
	
}
