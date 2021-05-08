package com.pfa.elearning.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pfa.elearning.model.Cours;
import com.pfa.elearning.repository.CoursRepository;
import com.pfa.elearning.service.ICoursService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CoursServiceImpl implements ICoursService {

	@Autowired
	private CoursRepository coursRepository;


	@Override
	public Cours save(Cours cours) {
		return coursRepository.saveAndFlush(cours);
	}

	@Override
	public Optional<Cours> partialUpdate(Cours cours) {

		return coursRepository
				.findById(cours.getId())
				.map(
						existingCours -> {
							if (cours.getTitreCours() != null) {
								existingCours.setTitreCours(cours.getTitreCours());
							}
							if (cours.getDescription() != null) {
								existingCours.setDescription(cours.getDescription());
							}
							if (cours.getSommaire() != null) {
								existingCours.setSommaire(cours.getSommaire());
							}
							if (cours.getDateCrea() != null) {
								existingCours.setDateCrea(cours.getDateCrea());
							}
							if (cours.getPrix() != null) {
								existingCours.setPrix(cours.getPrix());
							}
							if (cours.getCategorie() != null) {
								existingCours.setCategorie(cours.getCategorie());
							}

							return existingCours;
						}
				)
				.map(coursRepository::save);
	}

	@Override
	public Page<Cours> findAll(Pageable pageable) {
		return coursRepository.findAll(pageable);
	}

	@Override
	public Optional<Cours> findOne(Long id) {
		return coursRepository.findById(id);
	}

	@Override
	public boolean delete(Long id) {
		coursRepository.deleteById(id);
		return false;
	}
}
