package com.pfa.elearning.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public class UtilisateurDto {

	
	private Long idUtilisateur;
	
	private String nom;

	@Column
	private String email;

	@Column
	private String password;

	@Column
	private String photo;

	@Column
	private String role;

	private List<ReclamationDto> reclamations;
}
