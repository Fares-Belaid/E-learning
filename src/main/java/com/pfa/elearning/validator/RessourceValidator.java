package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import com.pfa.elearning.dto.RessourcesDto;

public class RessourceValidator {

	public static List<String> validate(RessourcesDto ressourcesDto) {
		List<String> errors = new ArrayList<String>();

		if (ressourcesDto == null) {
			errors.add("Veuillez renseigner le champs de ressource");
		}

		return errors;

	}
}
