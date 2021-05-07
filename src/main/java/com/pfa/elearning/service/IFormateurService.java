package com.pfa.elearning.service;

import java.util.List;
import java.util.Optional;

import com.pfa.elearning.model.Etudiant;
import com.pfa.elearning.model.Formateur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IFormateurService {

	Formateur save(Formateur formateur);

	Optional<Formateur> partialUpdate(Formateur formateur);

	Page<Formateur> findAll(Pageable pageable);

	Optional<Formateur> findOne(Long id);

	void delete(Long id);
}
