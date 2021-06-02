package com.pfa.elearning.service;

import java.util.List;
import java.util.Optional;

import com.pfa.elearning.model.Reponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IReponseService {

	Reponse save(Reponse reponse);

	Optional<Reponse> findById(Long id);

	List<Reponse> findAll();
	
	boolean delete(Long id);

	Optional<Reponse> partialUpdate(Reponse reponse);
}
