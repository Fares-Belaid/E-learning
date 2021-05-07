package com.pfa.elearning.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Inscription {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@CreatedDate
	@JsonIgnore
	@Column(nullable = false)
	private Instant dateInscri;
	
	@OneToMany(mappedBy = "inscriptions")
	private List<Etudiant> etudiants;
	
	@OneToMany(mappedBy = "inscri")
	private List<Cours> cours;
	
	@OneToMany(mappedBy = "inscription")
	private List<Avis> avis;
}
