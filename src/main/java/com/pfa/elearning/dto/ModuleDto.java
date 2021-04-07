package com.pfa.elearning.dto;




import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ModuleDto {

	private String nom;

	private String description;

	private CoursDto courses;
}
