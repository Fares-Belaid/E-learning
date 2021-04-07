package com.pfa.elearning.dto;



import java.time.Instant;
import java.util.List;




import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CoursDto {

	private String titreCours;
	
	private String 	description;
	
	private String sommaire;
	
	private Instant dateCrea;
	
	private float prix;
	
	private String categorie;
	
	private FormateurDto formateur;
	
	private InscriptionDto inscri;
	
	private List<RessourcesDto> ressources;
	
	private List<QuizDto> quiz;
	
	private List<ModuleDto> modules ;
}
