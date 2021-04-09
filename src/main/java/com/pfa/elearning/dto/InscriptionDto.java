package com.pfa.elearning.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.Inscription;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class InscriptionDto {

	
	private Long idInscription;
	
	private Instant dateInscri;
	@JsonIgnore
	private List<EtudiantDto> etudiants;
	@JsonIgnore
	private List<CoursDto> cours;
	@JsonIgnore
	private List<AvisDto> avis;
	

	public static InscriptionDto fromEntity(Inscription inscription) {
		if(inscription == null) {
			
			//to do throw an exception
			
		}
		
		return InscriptionDto.builder()
				.idInscription(inscription.getIdInscription())
				.dateInscri(inscription.getDateInscri())
				.build();
	}
	
	public static Inscription toEntity(InscriptionDto inscriptionDto) {
		if(inscriptionDto == null) {
			
			//to do throw an exception
			
		}
		
		Inscription inscription = new Inscription();
		inscription.setIdInscription(inscriptionDto.getIdInscription());
		inscription.setDateInscri(inscriptionDto.getDateInscri());

		
		return inscription;
	}
}
