package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.elearning.dto.ModuleDto;

public class ModuleValidator {

	public static List<String> validate(ModuleDto moduleDto) {
		List<String> errors = new ArrayList<String>();

		if (moduleDto == null) {
			errors.add("Veuillez renseigner les champs de module");
		}

		if (!StringUtils.hasLength(moduleDto.getNom())) {
			errors.add("Veuillez renseigner le nom de module");
		}
		if (!StringUtils.hasLength(moduleDto.getDescription())) {
			errors.add("Veuillez renseigner la description de module");
		}

		return errors;

	}
}
