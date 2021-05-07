package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.elearning.dto.QuizDto;

public class QuizValidator {

	public static List<String> validate(QuizDto quizDto) {
		List<String> errors = new ArrayList<String>();

		if (quizDto == null) {
			errors.add("Veuillez renseigner les champs de quiz");
		}

		if (!StringUtils.hasLength(quizDto.getNom())) {
			errors.add("Veuillez renseigner le nom de quiz");
		}
		if (!StringUtils.hasLength(quizDto.getDescription())) {
			errors.add("Veuillez renseigner la description de quiz");
		}
		
		if (!StringUtils.hasLength(String.valueOf(quizDto.getScoreMin()))) {
			errors.add("Veuillez renseigner le score ");
		}
		if (quizDto.getCours() == null ) {
			errors.add("Veuillez renseigner le cours de quiz");
		}
		
		if (quizDto.getQuestionQuizs() == null ) {
			errors.add("Veuillez renseigner les questions de quiz");
		}
		return errors;

	}
}