package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import com.pfa.elearning.model.Utilisateur;
import org.springframework.util.StringUtils;


public class UtilisateurValidator {

	public static List<String> validate(Utilisateur utilisateur) {
		List<String> errors = new ArrayList<String>();

		if (utilisateur == null) {
			errors.add("Veuillez renseigner les champs de l'utilisateur");
		}

		if (!StringUtils.hasLength(utilisateur.getFirstName())) {
			errors.add("Veuillez renseigner le nom ");
		}
		if (!StringUtils.hasLength(utilisateur.getEmail())) {
			errors.add("Veuillez renseigner l'email");
		}
		if (!StringUtils.hasLength(utilisateur.getPassword())) {
			errors.add("Veuillez renseigner le mot de passe");
		}
		if (!StringUtils.hasLength(utilisateur.getRole())) {
			errors.add("Veuillez renseigner le role");
		}

		return errors;

	}
}
