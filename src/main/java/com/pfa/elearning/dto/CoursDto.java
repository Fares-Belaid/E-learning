package com.pfa.elearning.dto;



import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.Cours;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CoursDto {

	
	private Long idCours;
	
	private String titreCours;
	
	private String 	description;
	
	private String sommaire;
	@JsonIgnore
	private Instant dateCrea;
	
	private BigDecimal prix;
	
	private String categorie;
	
	private FormateurDto formateur;
	@JsonIgnore
	private InscriptionDto inscri;
	
	private List<RessourcesDto> ressources;
	
	private List<QuizDto> quiz;
	
	private List<ModuleDto> modules ;
	
	public static CoursDto fromEntity(Cours cours) {
		if(cours == null) {
			
			//to do throw an exception
			
		}
		
		return CoursDto.builder()
				.idCours(cours.getIdCours())
				.titreCours(cours.getTitreCours())
				.description(cours.getDescription())
				.sommaire(cours.getSommaire())
				.prix(cours.getPrix())
				.categorie(cours.getCategorie())
				/*
				.formateur(FormateurDto.fromEntity(cours.getFormateur()))
				.ressource(RessourcesDto.fromEntity())
				*/
				.build();
	}
	
	public static Cours toEntity(CoursDto coursDto) {
		if(coursDto == null) {
			
			//to do throw an exception
			
		}
		
		Cours cours = new Cours();
		cours.setIdCours(coursDto.getIdCours());
		cours.setTitreCours(coursDto.getTitreCours());
		cours.setDescription(coursDto.getDescription());
		cours.setSommaire(coursDto.getSommaire());
		cours.setPrix(coursDto.getPrix());
		cours.setCategorie(coursDto.getCategorie());
		/*
		cours.setFormateur(coursDto.getFormateur());
		*/
		return cours;
	}
	
}
