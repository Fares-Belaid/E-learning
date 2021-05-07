package com.pfa.elearning.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Commentaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCommentaire;
	
	@Column
	private String commentaire;
	
	@CreatedDate
	@JsonIgnore
	@Column(nullable = false)
	private Instant dateCreation;
	
	@ManyToOne
	private Avis avis;
}
