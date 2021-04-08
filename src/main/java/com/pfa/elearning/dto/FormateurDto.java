package com.pfa.elearning.dto;

import java.util.List;



import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FormateurDto extends UtilisateurDto{

	
	private String grade;
	
	private String specialite;
	
	private List<CoursDto> cours;
}
