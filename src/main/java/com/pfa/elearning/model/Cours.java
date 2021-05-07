package com.pfa.elearning.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table
@EntityListeners(AuditingEntityListener.class)
public class Cours {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String titreCours;
	
	@Column
	private String 	description;
	
	@Column
	private String sommaire;

	@CreatedDate
	@Column(name="creationDate", nullable = false)
	@JsonIgnore
	private Instant dateCrea;
	
	@Column
	private BigDecimal prix;
	
	@Column
	private String categorie;
	
	@ManyToOne
	private Formateur formateur;
	
	@ManyToOne
	private Inscription inscri;
	
	@OneToMany(mappedBy = "cours", cascade = CascadeType.ALL)
	private List<Ressources> ressources;
	
	@OneToMany(mappedBy = "cours",cascade = CascadeType.ALL)
	private List<Quiz> quiz;
	
	@OneToMany(mappedBy = "cours", cascade = CascadeType.ALL)
	private List<Module> modules ;
}
