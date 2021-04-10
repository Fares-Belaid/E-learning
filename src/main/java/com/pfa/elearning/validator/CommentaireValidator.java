package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import com.pfa.elearning.dto.CommentaireDto;

public class CommentaireValidator {

	public static List<String> validate(CommentaireDto commentaireDto) {
		List<String> errors = new ArrayList<String>();

		if (commentaireDto == null) {
			errors.add("Veuillez renseigner les champs de commentaire");
		}

		return errors;

	}
}
