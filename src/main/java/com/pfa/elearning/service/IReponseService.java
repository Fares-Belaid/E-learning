package com.pfa.elearning.service;

import java.util.Optional;

import com.pfa.elearning.model.Reponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IReponseService {

	Reponse save(Reponse reponse);

	Optional<Reponse> findById(Long id);

	Page<Reponse> findAll(Pageable pageable);
	
	boolean delete(Long id);

	Optional<Reponse> partialUpdate(Reponse reponse);
}
