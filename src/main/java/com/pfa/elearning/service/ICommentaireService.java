package com.pfa.elearning.service;

import java.util.List;
import java.util.Optional;

import com.pfa.elearning.model.Commentaire;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICommentaireService {


	Commentaire save(Commentaire commentaire);
	
	Optional<Commentaire> findById(Long id);

	Page<Commentaire> findAll(Pageable pageable);
	
	void delete(Long id);
}
