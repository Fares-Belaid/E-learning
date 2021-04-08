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

	private String email;

	private String photo;

	private String role;

	private List<ReclamationDto> reclamations;
}
