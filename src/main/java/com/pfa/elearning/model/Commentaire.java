package com.pfa.elearning.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Commentaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCommentaire;
	
	@Column
	private String commentaire;
	
	@CreatedDate
	@Column(nullable = false)
	private Instant dateCreation;
	
	@ManyToOne
	private Avis avis;
}
