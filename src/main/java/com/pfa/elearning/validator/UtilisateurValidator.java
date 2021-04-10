package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.elearning.dto.UtilisateurDto;

public class UtilisateurValidator {

	public static List<String> validate(UtilisateurDto utilisateurDto) {
		List<String> errors = new ArrayList<String>();

		if (utilisateurDto == null) {
			errors.add("Veuillez renseigner les champs de l'utilisateur");
		}

		if (!StringUtils.hasLength(utilisateurDto.getNom())) {
			errors.add("Veuillez renseigner le nom ");
		}
		if (!StringUtils.hasLength(utilisateurDto.getEmail())) {
			errors.add("Veuillez renseigner l'email");
		}
		if (!StringUtils.hasLength(utilisateurDto.getMotDePasse())) {
			errors.add("Veuillez renseigner le mot de passe");
		}
		if (!StringUtils.hasLength(utilisateurDto.getRole())) {
			errors.add("Veuillez renseigner le role");
		}

		return errors;

	}
}
