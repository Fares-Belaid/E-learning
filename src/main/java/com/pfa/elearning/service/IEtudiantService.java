package com.pfa.elearning.service;

import java.util.List;
import java.util.Optional;
import com.pfa.elearning.model.Cours;
import com.pfa.elearning.model.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEtudiantService {

	Etudiant save(Etudiant etudiant);

	Optional<Etudiant> partialUpdate(Etudiant etudiant);

	Page<Etudiant> findAll(Pageable pageable);

	Optional<Etudiant> findOne(Long id);

	void delete(Long id);
}
