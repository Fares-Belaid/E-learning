package com.pfa.elearning.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RessourcesDto {

	private Long id;
	
	private String ressource;

	private CoursDto cour;
}
