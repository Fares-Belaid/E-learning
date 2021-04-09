package com.pfa.elearning.dto;

import java.util.List;

import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.Utilisateur;

import lombok.Builder;
import lombok.Data;

@MappedSuperclass
@Data
@Builder
public class UtilisateurDto {

	
	private Long idUtilisateur;
	
	private String nom;

	private String email;

	private String photo;

	private String role;
	@JsonIgnore
	private List<ReclamationDto> reclamations;
	
	
	public static UtilisateurDto fromEntity(Utilisateur utilisateur) {
		if(utilisateur == null) {
			
			//to do throw an exception
			
		}
		
		return UtilisateurDto.builder()
				.idUtilisateur(utilisateur.getIdUtilisateur())
				.nom(utilisateur.getNom())
				.email(utilisateur.getEmail())
				.photo(utilisateur.getPhoto())
				.role(utilisateur.getRole())
				.build();
	}
	
	public static Utilisateur toEntity(UtilisateurDto utilisateurDto) {
		if(utilisateurDto == null) {
			
			//to do throw an exception
			
		}
		
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setIdUtilisateur(utilisateurDto.getIdUtilisateur());
		utilisateur.setNom(utilisateurDto.getNom());
		utilisateur.setEmail(utilisateurDto.getEmail());
		utilisateur.setPhoto(utilisateurDto.getPhoto());
		utilisateur.setRole(utilisateurDto.getRole());

		
		return utilisateur;
	}
}
