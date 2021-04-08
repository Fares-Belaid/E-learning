package com.pfa.elearning.dto;

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
		
	private String rating;
	
	@JsonIgnore
	private InscriptionDto inscription;
	@JsonIgnore
	private List<CommentaireDto> commentaires;
	
	
	public static AvisDto fromEntity(Avis avis) {
		if(avis == null) {
			
			//to do throw an exception
			
		}
		
		return AvisDto.builder()
				.idAvis(avis.getIdAvis())
				.titre(avis.getTitre())
				.description(avis.getDescription())
				.rating(avis.getRating())
				.build();
	}
	
	public static Avis toEntity(AvisDto avisDto) {
		if(avisDto == null) {
			
			//to do throw an exception
			
		}
		
		Avis avis = new Avis();
		avis.setIdAvis(avisDto.getIdAvis());
		avis.setTitre(avisDto.getTitre());
		avis.setDescription(avisDto.getDescription());
		avis.setRating(avisDto.getRating());
		
		return avis;
	}
}
