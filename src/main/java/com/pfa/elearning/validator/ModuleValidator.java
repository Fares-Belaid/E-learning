package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import com.pfa.elearning.model.Module;
import org.springframework.util.StringUtils;


public class ModuleValidator {

	public static List<String> validate(Module module) {
		List<String> errors = new ArrayList<String>();

		if (module == null) {
			errors.add("Veuillez renseigner les champs de module");
		}

		if (!StringUtils.hasLength(module.getName())) {
			errors.add("Veuillez renseigner le nom de module");
		}
		if (!StringUtils.hasLength(module.getDescription())) {
			errors.add("Veuillez renseigner la description de module");
		}

		return errors;

	}
}
