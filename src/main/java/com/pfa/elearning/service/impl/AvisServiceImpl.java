package com.pfa.elearning.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.elearning.dto.AvisDto;
import com.pfa.elearning.exception.EntityNotFoundException;
import com.pfa.elearning.exception.ErrorCodes;
import com.pfa.elearning.exception.InvalidEntityException;
import com.pfa.elearning.model.Avis;
import com.pfa.elearning.repository.AvisRepository;
import com.pfa.elearning.service.IAvisService;
import com.pfa.elearning.validator.AvisValidator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AvisServiceImpl implements IAvisService {

	@Autowired
	private AvisRepository avisRepository;

	@Override
	public AvisDto save(AvisDto dto) {
		List<String> errors = AvisValidator.validate(dto);
		if (!errors.isEmpty()) {
			log.error("avis not valid", dto);
			throw new InvalidEntityException("L'avis n'est pas valid ,'est pas valide", ErrorCodes.AVIS_NOT_VALID,
					errors);
		}
		return AvisDto.fromEntity(avisRepository.save(AvisDto.toEntity(dto)));
	}

	@Override
	public AvisDto findById(Long id) {
		if (id == null) {
			log.error("avis id is null");
			return null;
		}
		Optional<Avis> avis = avisRepository.findById(id);

		AvisDto dto = AvisDto.fromEntity(avis.get());

		return Optional.of(dto).orElseThrow(() -> new EntityNotFoundException(
				"Aucun avis avec l'id = " + id + " n'etait trouver dans la BD", ErrorCodes.AVIS_NOT_FOUND));
	}

	@Override
	public List<AvisDto> findAll() {
		return avisRepository.findAll().stream().map(AvisDto::fromEntity).collect(Collectors.toList());
	}

	@Override
	public void delete(Long id) {
		if (id == null) {
			log.error("avis id is null");
			return;
		}
		avisRepository.deleteById(id);

	}

}
