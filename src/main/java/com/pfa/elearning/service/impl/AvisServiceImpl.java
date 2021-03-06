package com.pfa.elearning.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import com.pfa.elearning.model.Avis;
import com.pfa.elearning.repository.AvisRepository;
import com.pfa.elearning.service.IAvisService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class AvisServiceImpl implements IAvisService {

	@Autowired
	private AvisRepository avisRepository;

	@Override
	public Avis save(Avis avis) {

		return avisRepository.saveAndFlush(avis);
	}

	@Override
	public Optional<Avis> findById(Long id) {
		if (id == null) {
			log.error("avis id is null");
			return null;
		}
		return avisRepository.findById(id);
	}


	@Override
	public boolean delete(Long id) {
		if (id == null) {
			log.error("avis id is null");
            return false;
		}
		avisRepository.deleteById(id);

        return false;
    }

	@Override
	public Optional<Avis> partialUpdate(Avis avis) {
		return avisRepository
				.findById(avis.getId())
				.map(
						existingAvis -> {
							if (avis.getDescription() != null) {
								existingAvis.setDescription(avis.getDescription());
							}
							if (avis.getDateCreation() != null) {
								existingAvis.setDateCreation(avis.getDateCreation());
							}
							if (avis.getRating() != null) {
								existingAvis.setRating(avis.getRating());
							}

							return existingAvis;
						}
				)
				.map(avisRepository::save);
	}

	@Override
	public List<Avis> findAll() {
		log.debug("Request to get all Avis");
		return avisRepository.findAll();
	}

}
