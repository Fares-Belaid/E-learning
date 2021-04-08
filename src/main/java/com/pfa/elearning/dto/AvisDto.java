package com.pfa.elearning.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.Avis;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AvisDto {

	private Long idAvis;

	private String titre;
	
	private String description;
	
	private Instant dateCreation;
	
	private String rating;
	
	@JsonIgnore
	private InscriptionDto inscription;
	@JsonIgnore
	private List<CommentaireDto> commentaires;
	
	
	public AvisDto fromEntity(Avis avis) {
		if(avis == null) {
			
			//to do throw an exception
			
		}
		
		return AvisDto.builder()
				.idAvis(avis.getIdAvis())
				.titre(avis.getTitre())
				.description(avis.getDescription())
				.dateCreation(avis.getDateCreation())
				.rating(avis.getRating())
				.build();
	}
	
	public Avis toEntity(AvisDto avisDto) {
		if(avisDto == null) {
			
			//to do throw an exception
			
		}
		
		return Avis.builder()
				.idAvis(avisDto.getIdAvis())
				.titre(avisDto.getTitre())
				.description(avisDto.getDescription())
				.dateCreation(avisDto.getDateCreation())
				.rating(avisDto.getRating())
				.build();
	}
}
