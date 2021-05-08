package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import com.pfa.elearning.model.QuestionQuiz;
import org.springframework.util.StringUtils;


public class QuestionQuizValidator {

	public static List<String> validate(QuestionQuiz questionQuiz) {
		List<String> errors = new ArrayList<String>();

		if (questionQuiz == null) {
			errors.add("Veuillez renseigner les champs de question quiz");
		}

		if (!StringUtils.hasLength(questionQuiz.getTitre())) {
			errors.add("Veuillez renseigner le titre ");
		}
		if (!StringUtils.hasLength(questionQuiz.getQuestion())) {
			errors.add("Veuillez renseigner la question de quiz");
		}
		if (!StringUtils.hasLength(questionQuiz.getReponse())) {
			errors.add("Veuillez renseigner la reponse de quiz");
		}
		if (!StringUtils.hasLength(questionQuiz.getExplication())) {
			errors.add("Veuillez renseigner l'explication la question de quiz");
		}

		return errors;

	}
}
