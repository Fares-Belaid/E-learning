package com.pfa.elearning.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.Reclamation;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ReclamationDto {

	
	private Long idReclamation;
	
	private String objet;

	private String message;
	@JsonIgnore
	private UtilisateurDto utilisateur;
	
	
	public static ReclamationDto fromEntity(Reclamation reclamation) {
		if(reclamation == null) {
			
			//to do throw an exception
			
		}
		
		return ReclamationDto.builder()
				.idReclamation(reclamation.getIdReclamation())
				.objet(reclamation.getObjet())
				.message(reclamation.getMessage())
				.build();
	}
	
	public static Reclamation toEntity(ReclamationDto reclamationDto) {
		if(reclamationDto == null) {
			
			//to do throw an exception
			
		}
		
		Reclamation reclamation = new Reclamation();
		reclamation.setIdReclamation(reclamationDto.getIdReclamation());
		reclamation.setObjet(reclamationDto.getObjet());
		reclamation.setMessage(reclamationDto.getMessage());
		
		return reclamation;
	}
}
