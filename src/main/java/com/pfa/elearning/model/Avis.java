package com.pfa.elearning.model;

import java.time.Instant;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Avis {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idAvis;
	
	@Column
	private String titre;
	
	@Column
	private String description;
	
	@CreatedDate
	@Column(nullable = false)
	private Instant dateCreation;
	
	@Column
	private String rating;
	
	@ManyToOne
	private Inscription inscription;
	
	@OneToMany(mappedBy = "avis", cascade = CascadeType.ALL)
	private List<Commentaire> commentaires;
}
