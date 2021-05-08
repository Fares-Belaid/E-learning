package com.pfa.elearning.service;

import java.util.Optional;

import com.pfa.elearning.model.Avis;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IAvisService {

	Avis save(Avis dto);
	
	Optional<Avis> findById(Long id);
	
	boolean delete(Long id);

	Optional<Avis> partialUpdate(Avis avis);

	Page<Avis> findAll(Pageable pageable);
}
