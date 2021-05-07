package com.pfa.elearning.service;

import java.util.List;
import java.util.Optional;

import com.pfa.elearning.dto.RessourcesDto;
import com.pfa.elearning.model.Cours;
import com.pfa.elearning.model.Ressources;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IRessourceService {

	Ressources save(Ressources ressources);

	Optional<Ressources> partialUpdate(Ressources ressources);

	Page<Ressources> findAll(Pageable pageable);

	Optional<Ressources> findOne(Long id);

	void delete(Long id);
}
