package com.pfa.elearning.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ReclamationDto {

	
	private Long idReclamation;
	
	private String objet;

	private String message;

	private UtilisateurDto utilisateur;
}
