package com.pfa.elearning.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.elearning.dto.CommentaireDto;
import com.pfa.elearning.exception.EntityNotFoundException;
import com.pfa.elearning.exception.ErrorCodes;
import com.pfa.elearning.exception.InvalidEntityException;
import com.pfa.elearning.model.Commentaire;
import com.pfa.elearning.repository.CommentaireRepository;
import com.pfa.elearning.service.ICommentaireService;
import com.pfa.elearning.validator.CommentaireValidator;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class CommentaireServiceImpl implements ICommentaireService {

	@Autowired
	private CommentaireRepository commentaireRepositroy;
	
	@Override
	public CommentaireDto save(CommentaireDto dto) {
		List<String> errors = CommentaireValidator.validate(dto);
		if(!errors.isEmpty()) {
			log.error("commentaire not valid",dto);
			throw new InvalidEntityException("commentaire n'est pas valide", ErrorCodes.COMMENTAIRE_NOT_VALID,errors);
		}
		return CommentaireDto.fromEntity(commentaireRepositroy.save(CommentaireDto.toEntity(dto)));
	}

	@Override
	public CommentaireDto findById(Long id) {
		if(id== null) {
			log.error("reclamation id is null");
			return null;
		}
		Optional <Commentaire> commentaire = commentaireRepositroy.findById(id);
		
		CommentaireDto dto = CommentaireDto.fromEntity(commentaire.get());
		
		return Optional.of(dto).orElseThrow(() ->
			new EntityNotFoundException(
					"Aucune commentaire avec l'id = "+ id + " n'ete touve dans la BD",
					ErrorCodes.COMMENTAIRE_NOT_FOUND));
	}

	@Override
	public List<CommentaireDto> findAll() {
		return commentaireRepositroy.findAll().stream().map(CommentaireDto::fromEntity).collect(Collectors.toList());

	}

	@Override
	public void delete(Long id) {
		if (id == null) {
			log.error("commentaire id is null");
			return ;
		}
		commentaireRepositroy.deleteById(id);		
	}

}
