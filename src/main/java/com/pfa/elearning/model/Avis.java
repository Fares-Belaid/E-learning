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
public class Avis {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAvis;
	
	@Column
	private String titre;
	
	@Column
	private String description;
	
	@Column
	private Instant dateCreation;
	
	@Column
	private String rating;
}
