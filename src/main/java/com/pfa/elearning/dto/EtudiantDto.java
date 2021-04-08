package com.pfa.elearning.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EtudiantDto extends UtilisateurDto {

	private String niveau;

	private InscriptionDto inscriptions;
}
