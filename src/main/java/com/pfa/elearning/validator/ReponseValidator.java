package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import com.pfa.elearning.model.Reponse;

public class ReponseValidator {

	public static List<String> validate(Reponse reponse) {
		List<String> errors = new ArrayList<String>();

		if (reponse == null) {
			errors.add("Veuillez renseigner les champs de reponse");
		}

		return errors;

	}
}
