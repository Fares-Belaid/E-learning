package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.elearning.dto.CoursDto;

public class CoursValidator {

	public static List<String> validate(CoursDto coursDto){
		List<String> errors = new ArrayList<String>();
		
		if (coursDto == null) {
			errors.add("Veuillez renseigner les champs du cours");
		}
		
		 if (!StringUtils.hasLength(coursDto.getTitreCours())) {
			errors.add("Veuillez renseigner le titre de cours");
		}
		 if (!StringUtils.hasLength(coursDto.getDescription())) {
				errors.add("Veuillez renseigner la description du cours");
			}	
		 if (!StringUtils.hasLength(coursDto.getSommaire())) {
				errors.add("Veuillez renseigner le sommaire du cours");
			}	
		 if (coursDto.getPrix() == null) {
				errors.add("Veuillez renseigner le prix du cours");
			}	
		 if (!StringUtils.hasLength(coursDto.getCategorie())) {
				errors.add("Veuillez renseigner la categorie du cours");
			}	

		 return errors ;
		
	}
}
