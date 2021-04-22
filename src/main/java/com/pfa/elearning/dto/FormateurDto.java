package com.pfa.elearning.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.Formateur;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FormateurDto extends UtilisateurDto{


	private String grade;
	
	private String specialite;
	@JsonIgnore
	private List<CoursDto> cours;
	
	public static FormateurDto fromEntity(FormateurDto formateurDto) {
		if(formateurDto == null) {
			
			//to do throw an exception
			
		}
		
		return FormateurDto.builder()
				.idUtilisateur(UtilisateurDto.fromEntity(formateurDto.getIdUtilisateur()))
				.nom(formateurDto.getNom())
				.email(formateurDto.getEmail())
				.motDePasse(formateurDto.getMotDePasse())
				.photo(formateurDto.getPhoto())
				.role(formateurDto.getRole())
				.grade(formateurDto.getGrade())
				.specialite(formateurDto.getSpecialite())
				.build();
	}
	
	
	/*
	public static Formateur toEntity(FormateurDto formateurDto) {
		if(formateurDto == null) {
			
			//to do throw an exception
			
		}
		
		Formateur formateur = new Formateur();
		formateur.setIdUtilisateur(EtudiantDto.getIdUtilisateur());
		formateur.setNom(UtilisateurDto.toEntity();

		
		return formateurDto;
	}
	*/
}
