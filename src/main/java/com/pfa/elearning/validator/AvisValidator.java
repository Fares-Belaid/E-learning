package com.pfa.elearning.validator;

import java.util.ArrayList;
import java.util.List;

import com.pfa.elearning.model.Avis;
import org.springframework.util.StringUtils;


public class AvisValidator {

	public static List<String> validate(Avis avis){
		List<String> errors = new ArrayList<String>();
		
		if (avis == null) {
			errors.add("Veuillez renseigner les champs de l'avis");
		}

		 if (!StringUtils.hasLength(avis.getDescription())) {
				errors.add("Veuillez renseigner la description");
			}	
		 if (!StringUtils.hasLength(avis.getRating())) {
				errors.add("Veuillez renseigner le rating");
			}	


		 return errors ;
		
	}
}
