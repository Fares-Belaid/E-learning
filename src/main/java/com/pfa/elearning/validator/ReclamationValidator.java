package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import com.pfa.elearning.model.Reclamation;
import org.springframework.util.StringUtils;


public class ReclamationValidator {

	public static List<String> validate(Reclamation reclamation) {
		List<String> errors = new ArrayList<String>();

		if (reclamation == null) {
			errors.add("Veuillez renseigner les champs de reclamation");
		}

		if (!StringUtils.hasLength(reclamation.getObjet())) {
			errors.add("Veuillez renseigner l'objet de reclamtion");
		}
		if (!StringUtils.hasLength(reclamation.getMessage())) {
			errors.add("Veuillez renseigner le message de reclalmation");
		}

		return errors;

	}
}
