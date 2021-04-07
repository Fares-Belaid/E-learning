package com.pfa.elearning.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table
public class Cours {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCours;
	
	@Column
	private String titreCours;
	
	@Column
	private String 	description;
	
	@Column
	private String sommaire;
	
	@Column
	private Instant dateCrea;
	
	@Column
	private float prix;
	
	@Column
	private String categorie;
	
	@ManyToOne
	private Formateur formateur;
	
	@ManyToOne
	private Inscription inscri;
	
	@OneToMany(mappedBy = "cour")
	private List<Ressources> ressources;
	
	@OneToMany(mappedBy = "cours")
	private List<Quiz> quiz;
	
	@OneToMany(mappedBy = "courses", cascade = CascadeType.ALL)
	private List<Module> modules ;
}
