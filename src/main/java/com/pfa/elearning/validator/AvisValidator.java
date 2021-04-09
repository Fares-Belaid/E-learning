package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.elearning.dto.AvisDto;

public class AvisValidator {

	public static List<String> validate(AvisDto avisDto){
		List<String> errors = new ArrayList<String>();
		
		if (avisDto == null) {
			errors.add("Veuillez renseigner les champs de l'avis");
		}
		
		 if (!StringUtils.hasLength(avisDto.getTitre())) {
			errors.add("Veuillez renseigner le titre");
		}
		 if (!StringUtils.hasLength(avisDto.getDescription())) {
				errors.add("Veuillez renseigner la description");
			}	
		 if (!StringUtils.hasLength(avisDto.getRating())) {
				errors.add("Veuillez renseigner le rating");
			}	


		 return errors ;
		
	}
}
