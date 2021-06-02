package com.pfa.elearning.service;

import java.util.List;
import java.util.Optional;

import com.pfa.elearning.model.Avis;


public interface IAvisService {

	Avis save(Avis avis);
	
	Optional<Avis> findById(Long id);
	
	boolean delete(Long id);

	Optional<Avis> partialUpdate(Avis avis);

	List<Avis> findAll();
}
