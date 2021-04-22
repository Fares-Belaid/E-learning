package com.pfa.elearning.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.Etudiant;
import com.pfa.elearning.model.Inscription;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EtudiantDto extends UtilisateurDto {

	private String niveau;

	@JsonIgnore
	private InscriptionDto inscriptions;
	

	public static EtudiantDto fromEntity(EtudiantDto etudiantDto) {
		if(etudiantDto == null) {
			
			//to do throw an exception
			
		}
		
		return EtudiantDto.builder()
				.idUtilisateur(UtilisateurDto.fromEntity(etudiantDto.getIdUtilisateur()))
				.nom(etudiantDto.getNom())
				.email(etudiantDto.getEmail())
				.motDePasse(etudiantDto.getMotDePasse())
				.photo(etudiantDto.getPhoto())
				.role(etudiantDto.getRole())
				.niveau(etudiantDto.getNiveau())
				.build();
	}
	
	/*
	
	public static Etudiant toEntity(EtudiantDto etudiantDto) {
		if(etudiantDto == null) {
			
			//to do throw an exception
			
		}
		
		Etudiant etudiant = new Etudiant();
		etudiant.setIdUtilisateur(EtudiantDto.getIdUtilisateur());
		etudiant.setNom(EtudiantDto.getNom());

		
		return etudiantDto;
	}
	*/
}
