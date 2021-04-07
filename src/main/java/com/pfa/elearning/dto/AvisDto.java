package com.pfa.elearning.dto;

import java.time.Instant;
import java.util.List;




import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AvisDto {


	private String titre;
	
	private String description;
	
	private Instant dateCreation;
	
	private String rating;
	
	private InscriptionDto inscription;
	
	private List<CommentaireDto> commentaires;
}
