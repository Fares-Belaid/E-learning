package com.pfa.elearning.dto;

import java.time.Instant;
import java.util.List;




import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class InscriptionDto {

	private Instant DateInscri;

	private List<EtudiantDto> etudiants;

	private List<CoursDto> cours;

	private List<AvisDto> avis;
}
