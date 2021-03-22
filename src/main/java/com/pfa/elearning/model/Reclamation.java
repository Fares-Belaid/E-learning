package com.pfa.elearning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Reclamation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idReclamation;
	
	@Column
	private String objet;
	
	@Column
	private String message;
	
	@ManyToOne
	private Utilisateur utilisateur;
}
