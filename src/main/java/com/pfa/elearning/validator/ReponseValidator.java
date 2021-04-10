package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import com.pfa.elearning.dto.ReponseDto;

public class ReponseValidator {

	public static List<String> validate(ReponseDto reponseDto) {
		List<String> errors = new ArrayList<String>();

		if (reponseDto == null) {
			errors.add("Veuillez renseigner les champs de reponse");
		}

		return errors;

	}
}
