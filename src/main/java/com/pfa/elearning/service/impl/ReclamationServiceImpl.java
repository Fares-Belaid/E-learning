package com.pfa.elearning.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.elearning.dto.ReclamationDto;
import com.pfa.elearning.exception.EntityNotFoundException;
import com.pfa.elearning.exception.ErrorCodes;
import com.pfa.elearning.exception.InvalidEntityException;
import com.pfa.elearning.model.Reclamation;
import com.pfa.elearning.repository.ReclamationRepository;
import com.pfa.elearning.service.IReclamationService;
import com.pfa.elearning.validator.ReclamationValidator;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class ReclamationServiceImpl implements IReclamationService {

	@Autowired
	private ReclamationRepository reclamationRepository;
		

	@Override
	public ReclamationDto save(ReclamationDto dto) {
		
		List<String> errors = ReclamationValidator.validate(dto);
		if(!errors.isEmpty()) {
			log.error("reclamation not valid",dto);
			throw new InvalidEntityException("La reclamation ,'est pas valide", ErrorCodes.RECLAMATION_NOT_VALID,errors);
		}
		return ReclamationDto.fromEntity(reclamationRepository.save(ReclamationDto.toEntity(dto)));
	}

	@Override
	public ReclamationDto findById(Long id) {
		if(id== null) {
			log.error("reclamation id is null");
			return null;
		}
		Optional <Reclamation> reclamation = reclamationRepository.findById(id);
		
		ReclamationDto dto = ReclamationDto.fromEntity(reclamation.get());
		
		return Optional.of(dto).orElseThrow(() ->
			new EntityNotFoundException(
					"Aucune reclamation avec l'id = "+ id + " n'ete touve dans la BD",
					ErrorCodes.RECLAMATION_NOT_FOUND));
	}

	@Override
	public List<ReclamationDto> findAll() {
	
		return reclamationRepository.findAll().stream().map(ReclamationDto::fromEntity).collect(Collectors.toList());
	}

	@Override
	public void delete(Long id) {
		
		if (id == null) {
			log.error("reclamation id is null");
			return ;
		}
		reclamationRepository.deleteById(id);
		
	}

	
}
