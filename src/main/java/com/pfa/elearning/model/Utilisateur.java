package com.pfa.elearning.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor

public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUtilisateur;
	
	@Column
	private String nom;
	
	@Column
	private String email;
	
	@Column
	private String password;
	
	@Column
	private String photo;
	
	@Column
	private String role;

	@OneToMany(mappedBy = "utilisateur")
	private List<Reclamation> reclamations;
}
