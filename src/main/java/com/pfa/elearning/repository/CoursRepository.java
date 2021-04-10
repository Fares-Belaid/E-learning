package com.pfa.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.elearning.model.Cours;
import com.pfa.elearning.model.Formateur;

public interface CoursRepository extends JpaRepository<Cours, Long> {

	Cours findByTitreCours(String titreCours);
	Cours findByCategorie(String categorie);
	Cours findByFormateur(Formateur formateur);
	
	
}
