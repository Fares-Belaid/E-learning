package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.elearning.dto.ReclamationDto;

public class ReclamationValidator {

	public static List<String> validate(ReclamationDto reclamationDto){
		List<String> errors = new ArrayList<String>();
		
		if (reclamationDto == null) {
			errors.add("Veuillez renseigner les champs de reclamation");
		}
		
		 if (!StringUtils.hasLength(reclamationDto.getObjet())) {
			errors.add("Veuillez renseigner l'objet de reclamtion");
		}
		 if (!StringUtils.hasLength(reclamationDto.getMessage())) {
				errors.add("Veuillez renseigner le message de reclalmation");
			}	


		 return errors ;
		
	}
}
