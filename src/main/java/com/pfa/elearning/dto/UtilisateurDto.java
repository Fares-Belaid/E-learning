package com.pfa.elearning.dto;

import java.util.List;

import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.Utilisateur;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurDto {

	
	private Long idUtilisateur;
	
	private String nom;

	private String email;
	
	private String motDePasse;

	private String photo;

	private String role;
	@JsonIgnore
	private List<ReclamationDto> reclamations;
	
	
	public static UtilisateurDto fromEntity(Utilisateur utilisateur) {
		if(utilisateur == null) {
			
			//to do throw an exception
			
		}
	
		UtilisateurDto utilisateurDto = new UtilisateurDto();
		utilisateurDto.setIdUtilisateur(utilisateur.getIdUtilisateur());
		utilisateurDto.setNom(utilisateur.getNom());
		utilisateurDto.setEmail(utilisateur.getEmail());
		utilisateurDto.setMotDePasse(utilisateur.getPassword());
		utilisateurDto.setPhoto(utilisateur.getPhoto());
		utilisateurDto.setRole(utilisateur.getRole());
		
		return utilisateurDto;
		
		/*		
		return UtilisateurDto.builder()
				.idUtilisateur(utilisateur.getIdUtilisateur())
				.nom(utilisateur.getNom())
				.email(utilisateur.getEmail())
				.motDePasse(utilisateur.getPassword())
				.photo(utilisateur.getPhoto())
				.role(utilisateur.getRole())
				.build();     
				
		*/
	}
	
	public static Utilisateur toEntity(UtilisateurDto utilisateurDto) {
		if(utilisateurDto == null) {
			
			//to do throw an exception
			
		}
		
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setIdUtilisateur(utilisateurDto.getIdUtilisateur());
		utilisateur.setNom(utilisateurDto.getNom());
		utilisateur.setEmail(utilisateurDto.getEmail());
		utilisateur.setPassword(utilisateurDto.getMotDePasse());
		utilisateur.setPhoto(utilisateurDto.getPhoto());
		utilisateur.setRole(utilisateurDto.getRole());

		
		return utilisateur;
	}
}
