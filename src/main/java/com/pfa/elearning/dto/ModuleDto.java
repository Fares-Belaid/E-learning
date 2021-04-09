package com.pfa.elearning.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pfa.elearning.model.Module;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ModuleDto {

	private Long idModule;

	private String nom;

	private String description;
	@JsonIgnore
	private CoursDto courses;

	public static ModuleDto fromEntity(Module module) {
		if (module == null) {

			// to do throw an exception

		}

		return ModuleDto.builder().idModule(module.getIdModule()).nom(module.getNom())
				.description(module.getDescription()).build();
	}

	public static Module toEntity(ModuleDto moduleDto) {
		if (moduleDto == null) {

			// to do throw an exception

		}

		Module module = new Module();
		module.setIdModule(moduleDto.getIdModule());
		module.setNom(moduleDto.getNom());
		module.setDescription(moduleDto.getDescription());

		return module;
	}
}
