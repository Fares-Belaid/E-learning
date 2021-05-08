package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import com.pfa.elearning.model.Quiz;
import org.springframework.util.StringUtils;


public class QuizValidator {

	public static List<String> validate(Quiz quiz) {
		List<String> errors = new ArrayList<String>();

		if (quiz == null) {
			errors.add("Veuillez renseigner les champs de quiz");
		}

		if (!StringUtils.hasLength(quiz.getTitre())) {
			errors.add("Veuillez renseigner le nom de quiz");
		}
		if (!StringUtils.hasLength(quiz.getDescription())) {
			errors.add("Veuillez renseigner la description de quiz");
		}
		
		if (!StringUtils.hasLength(String.valueOf(quiz.getScoreMin()))) {
			errors.add("Veuillez renseigner le score ");
		}
		if (quiz.getCours() == null ) {
			errors.add("Veuillez renseigner le cours de quiz");
		}
		
		if (quiz.getQuestionQuizs() == null ) {
			errors.add("Veuillez renseigner les questions de quiz");
		}
		return errors;

	}
}
