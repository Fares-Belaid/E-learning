package com.pfa.elearning.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Inscription {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idInscription;
	
	@CreatedDate
	@Column(nullable = false)
	private Instant DateInscri;
	
	@OneToMany(mappedBy = "inscriptions")
	private List<Etudiant> etudiants;
	
	@OneToMany(mappedBy = "inscri")
	private List<Cours> cours;
	
	@OneToMany(mappedBy = "inscription")
	private List<Avis> avis;
}
