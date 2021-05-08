package com.pfa.elearning.service;

import java.util.Optional;


import com.pfa.elearning.model.Ressources;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IRessourceService {

	Ressources save(Ressources ressources);

	Optional<Ressources> partialUpdate(Ressources ressources);

	Page<Ressources> findAll(Pageable pageable);

	Optional<Ressources> findOne(Long id);

	boolean delete(Long id);
}
