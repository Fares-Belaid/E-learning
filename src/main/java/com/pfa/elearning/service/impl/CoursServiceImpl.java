package com.pfa.elearning.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.pfa.elearning.dto.CoursDto;
import com.pfa.elearning.exception.EntityNotFoundException;
import com.pfa.elearning.exception.ErrorCodes;
import com.pfa.elearning.exception.InvalidEntityException;
import com.pfa.elearning.model.Cours;
import com.pfa.elearning.repository.CoursRepository;
import com.pfa.elearning.service.ICoursService;
import com.pfa.elearning.validator.CoursValidator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CoursServiceImpl implements ICoursService {

	@Autowired
	private CoursRepository coursRepository;

	@Override
	public CoursDto save(CoursDto dto) {
		List<String> errors = CoursValidator.validate(dto);
		if (!errors.isEmpty()) {
			log.error("cours not valid", dto);
			throw new InvalidEntityException("Le cours n'est pas valide", ErrorCodes.COURS_NOT_VALID, errors);
		}
		return CoursDto.fromEntity(coursRepository.save(CoursDto.toEntity(dto)));
	}

	@Override
	public CoursDto findById(Long id) {
		if (id == null) {
			log.error("cours id is null");
			return null;
		}
		Optional<Cours> cours = coursRepository.findById(id);

		CoursDto dto = CoursDto.fromEntity(cours.get());

		return Optional.of(dto).orElseThrow(() -> new EntityNotFoundException(
				"Aucun cours avec l'id = " + id + " n'ete touve dans la BD", ErrorCodes.COURS_NOT_FOUND));
	}

	@Override
	public List<CoursDto> findAll() {
		return coursRepository.findAll().stream().map(CoursDto::fromEntity).collect(Collectors.toList());

	}

	@Override
	public void delete(Long id) {
		if (id == null) {
			log.error("reclamation id is null");
			return;
		}
		coursRepository.deleteById(id);
	}

	@Override
	public List<CoursDto> findByCategorie(String categorie) {
		if (StringUtils.hasLength(categorie)) {
			log.error("category is null");
			return null;
		}
		return coursRepository.findByCategorie(categorie).stream().map(CoursDto::fromEntity)
				.collect(Collectors.toList());

	}

	@Override
	public CoursDto findByTitre(String titreCours) {
		if (StringUtils.hasLength(titreCours)) {
			log.error("titre is null");
			return null;
		}
		Optional<Cours> cours = coursRepository.findByTitre(titreCours);

		CoursDto dto = CoursDto.fromEntity(cours.get());

		return Optional.of(dto)
				.orElseThrow(() -> new EntityNotFoundException(
						"Aucun cours avec le titre = " + titreCours + " n'ete touve dans la BD",
						ErrorCodes.COURS_NOT_FOUND));

	}

}
