package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import com.pfa.elearning.model.Ressources;

public class RessourceValidator {

	public static List<String> validate(Ressources ressources) {
		List<String> errors = new ArrayList<String>();

		if (ressources == null) {
			errors.add("Veuillez renseigner le champs de ressource");
		}

		return errors;

	}
}
