package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import com.pfa.elearning.model.Commentaire;

public class CommentaireValidator {

	public static List<String> validate(Commentaire commentaire) {
		List<String> errors = new ArrayList<String>();

		if (commentaire == null) {
			errors.add("Veuillez renseigner les champs de commentaire");
		}

		return errors;

	}
}
