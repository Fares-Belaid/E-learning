package com.pfa.elearning.dto;




import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ModuleDto {

	
	private Long idModule;
	
	private String nom;

	private String description;

	private CoursDto courses;
}
