package com.pfa.elearning.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EtudiantDto extends UtilisateurDto {

	private String niveau;

	@JsonIgnore
	private InscriptionDto inscriptions;
}
