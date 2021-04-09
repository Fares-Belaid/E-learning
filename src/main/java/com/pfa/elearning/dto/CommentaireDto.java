package com.pfa.elearning.dto;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.Commentaire;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommentaireDto {

	
	private Long idCommentaire;
	
	private String commentaire;

	@JsonIgnore
	private Instant dateCreation;
	@JsonIgnore
	private AvisDto avis;
	
	public static CommentaireDto fromEntity(Commentaire commentaire) {
		if(commentaire == null) {
			
			//to do throw an exception
			
		}
		
		return CommentaireDto.builder()
				.idCommentaire(commentaire.getIdCommentaire())
				.commentaire(commentaire.getCommentaire())
				.build();
	}
	
	public static Commentaire toEntity(CommentaireDto commentaireDto) {
		if(commentaireDto == null) {
			
			//to do throw an exception
			
		}
		
		Commentaire commentaire = new Commentaire();
		commentaire.setIdCommentaire(commentaireDto.getIdCommentaire());
		commentaire.setCommentaire(commentaireDto.getCommentaire());

		
		return commentaire;
	}
	
}
