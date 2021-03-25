package com.pfa.elearning.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Commentaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCommentaire;
	
	@Column
	private String commentaire;
	
	@Column
	private Instant dateCreation;
}
