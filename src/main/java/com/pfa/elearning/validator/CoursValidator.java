package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import com.pfa.elearning.model.Cours;
import org.springframework.util.StringUtils;


public class CoursValidator {

	public static List<String> validate(Cours cours) {
		List<String> errors = new ArrayList<String>();

		if (cours == null) {
			errors.add("Veuillez renseigner les champs du cours");
		}

		if (!StringUtils.hasLength(cours.getTitreCours())) {
			errors.add("Veuillez renseigner le titre de cours");
		}
		if (!StringUtils.hasLength(cours.getDescription())) {
			errors.add("Veuillez renseigner la description du cours");
		}
		if (!StringUtils.hasLength(cours.getSommaire())) {
			errors.add("Veuillez renseigner le sommaire du cours");
		}
		if (cours.getPrix() == null) {
			errors.add("Veuillez renseigner le prix du cours");
		}
		if (!StringUtils.hasLength(cours.getCategorie())) {
			errors.add("Veuillez renseigner la categorie du cours");
		}

		if (cours.getFormateur() == null) {
			errors.add("Veuillez renseigner le formateur du cours");
		}

		if (cours.getQuiz() == null) {
			errors.add("Veuillez renseigner le quiz du cours");
		}
		if (cours.getModules() == null) {
			errors.add("Veuillez renseigner les modules du cours");
		}

		return errors;

	}
}
