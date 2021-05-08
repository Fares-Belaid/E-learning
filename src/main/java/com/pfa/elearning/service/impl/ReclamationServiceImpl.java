package com.pfa.elearning.service.impl;


import java.util.Optional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.pfa.elearning.model.Reclamation;
import com.pfa.elearning.repository.ReclamationRepository;
import com.pfa.elearning.service.IReclamationService;

import org.springframework.transaction.annotation.Transactional;


@Service

public class ReclamationServiceImpl implements IReclamationService {

	private final Logger log = LoggerFactory.getLogger(ReclamationServiceImpl.class);

	private final ReclamationRepository reclamationRepository;

	@Autowired
	public ReclamationServiceImpl(ReclamationRepository reclamationRepository) {
		this.reclamationRepository = reclamationRepository;
	}

	@Override
	public Reclamation save(Reclamation reclamation) {
		log.debug("Request to save Reclamation : {}", reclamation);
		return reclamationRepository.saveAndFlush(reclamation);
	}

	@Override
	public Optional<Reclamation> partialUpdate(Reclamation reclamation) {
		log.debug("Request to partially update Reclamation : {}", reclamation);

		return reclamationRepository
				.findById(reclamation.getId())
				.map(
						existingReclamation -> {
							if (reclamation.getObjet() != null) {
								existingReclamation.setObjet(reclamation.getObjet());
							}
							if (reclamation.getMessage() != null) {
								existingReclamation.setMessage(reclamation.getMessage());
							}

							return existingReclamation;
						}
				)
				.map(reclamationRepository::save);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Reclamation> findAll(Pageable pageable) {
		log.debug("Request to get all Reclamations");
		return reclamationRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Reclamation> findOne(Long id) {
		log.debug("Request to get Reclamation : {}", id);
		return reclamationRepository.findById(id);
	}

	@Override
	public boolean delete(Long id) {
		log.debug("Request to delete Reclamation : {}", id);
		reclamationRepository.deleteById(id);
        return false;
    }

	
}
