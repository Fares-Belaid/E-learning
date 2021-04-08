package com.pfa.elearning.dto;

import java.time.Instant;



import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommentaireDto {

	
	private Long idCommentaire;
	
	private String commentaire;

	private Instant dateCreation;
	
	private AvisDto avis;
}
