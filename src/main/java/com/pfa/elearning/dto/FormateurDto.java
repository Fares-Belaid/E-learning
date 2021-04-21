package com.pfa.elearning.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FormateurDto extends UtilisateurDto{


	private String grade;
	
	private String specialite;
	@JsonIgnore
	private List<CoursDto> cours;
}
