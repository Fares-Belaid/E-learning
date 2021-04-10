package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.elearning.dto.QuestionQuizDto;

public class QuestionQuizValidator {

	public static List<String> validate(QuestionQuizDto questionQuizDto) {
		List<String> errors = new ArrayList<String>();

		if (questionQuizDto == null) {
			errors.add("Veuillez renseigner les champs de question quiz");
		}

		if (!StringUtils.hasLength(questionQuizDto.getTitre())) {
			errors.add("Veuillez renseigner le titre ");
		}
		if (!StringUtils.hasLength(questionQuizDto.getQuestion())) {
			errors.add("Veuillez renseigner la question de quiz");
		}
		if (!StringUtils.hasLength(questionQuizDto.getReponse())) {
			errors.add("Veuillez renseigner la reponse de quiz");
		}
		if (!StringUtils.hasLength(questionQuizDto.getExplication())) {
			errors.add("Veuillez renseigner l'explication la question de quiz");
		}

		return errors;

	}
}
