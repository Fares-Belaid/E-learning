package com.pfa.elearning.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.Ressources;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RessourcesDto {

	private Long id;
	
	private String ressource;
	@JsonIgnore
	private CoursDto cour;
	
	public static RessourcesDto fromEntity(Ressources ressources) {
		if(ressources == null) {
			
			//to do throw aRessourcesDton exception
			
		}
		
		return RessourcesDto.builder()
				.id(ressources.getId())
				.ressource(ressources.getRessource())
				.build();
	}
	
	public static Ressources toEntity(RessourcesDto ressourcesDto) {
		if(ressourcesDto == null) {
			
			//to do throw an exception
			
		}
		
		Ressources ressources = new Ressources();
		ressources.setId(ressourcesDto.getId());
		ressources.setRessource(ressourcesDto.getRessource());

		return ressources;
	}
}
