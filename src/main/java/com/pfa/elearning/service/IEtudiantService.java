package com.pfa.elearning.service;

import java.util.Optional;

import com.pfa.elearning.model.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEtudiantService {

	Etudiant save(Etudiant etudiant);

	Optional<Etudiant> partialUpdate(Etudiant etudiant);

	Page<Etudiant> findAll(Pageable pageable);

	Optional<Etudiant> findOne(Long id);

	boolean delete(Long id);
}
