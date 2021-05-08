package com.pfa.elearning.service;

import java.util.Optional;

import com.pfa.elearning.model.Reclamation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IReclamationService {

	Reclamation save(Reclamation reclamation);

	Optional<Reclamation> partialUpdate(Reclamation reclamation);

	Page<Reclamation> findAll(Pageable pageable);

	Optional<Reclamation> findOne(Long id);

	boolean delete(Long id);
	
	
}
