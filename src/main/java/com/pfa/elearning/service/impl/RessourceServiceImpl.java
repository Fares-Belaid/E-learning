package com.pfa.elearning.service.impl;

import java.util.List;
import java.util.Optional;

import com.pfa.elearning.model.Cours;
import com.pfa.elearning.model.Ressources;
import com.pfa.elearning.repository.RessourceRepository;
import com.pfa.elearning.service.IRessourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RessourceServiceImpl implements IRessourceService {

	private final Logger log = LoggerFactory.getLogger(RessourceServiceImpl.class);

	@Autowired
	private  RessourceRepository ressourcesRepository;

	@Override
	public Ressources save(Ressources ressources) {
		log.debug("Request to save Ressources : {}", ressources);
		return ressourcesRepository.save(ressources);
	}

	@Override
	public Optional<Ressources> partialUpdate(Ressources ressources) {
		log.debug("Request to partially update Ressources : {}", ressources);

		return ressourcesRepository
				.findById(ressources.getId())
				.map(
						existingRessources -> {
							if (ressources.getRessource() != null) {
								existingRessources.setRessource(ressources.getRessource());
							}
							if (ressources.getImage() != null) {
								existingRessources.setImage(ressources.getImage());
							}
							if (ressources.getImageContentType() != null) {
								existingRessources.setImageContentType(ressources.getImageContentType());
							}
							if (ressources.getPdf() != null) {
								existingRessources.setPdf(ressources.getPdf());
							}
							if (ressources.getPdfContentType() != null) {
								existingRessources.setPdfContentType(ressources.getPdfContentType());
							}

							return existingRessources;
						}
				)
				.map(ressourcesRepository::save);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Ressources> findAll(Pageable pageable) {
		log.debug("Request to get all Ressources");
		return ressourcesRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Ressources> findOne(Long id) {
		log.debug("Request to get Ressources : {}", id);
		return ressourcesRepository.findById(id);
	}

	@Override
	public void delete(Long id) {
		log.debug("Request to delete Ressources : {}", id);
		ressourcesRepository.deleteById(id);
	}

}
