package com.pfa.elearning.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pfa.elearning.model.Commentaire;
import com.pfa.elearning.repository.CommentaireRepository;
import com.pfa.elearning.service.ICommentaireService;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class CommentaireServiceImpl implements ICommentaireService {

	@Autowired
	private CommentaireRepository commentaireRepositroy;
	
	@Override
	public Commentaire save(Commentaire commentaire) {
		return commentaireRepositroy.saveAndFlush(commentaire);
	}

	@Override
	public Optional<Commentaire> findById(Long id) {
		if(id== null) {
			log.error("reclamation id is null");
			return null;
		}
		return commentaireRepositroy.findById(id);
	}

	@Override
	public Optional<Commentaire> partialUpdate(Commentaire commentaire) {
		return commentaireRepositroy
				.findById(commentaire.getIdCommentaire())
				.map(
						existingCommentaire -> {
							if (commentaire.getCommentaire() != null) {
								existingCommentaire.setCommentaire(commentaire.getCommentaire());
							}
							if (commentaire.getDateCreation() != null) {
								existingCommentaire.setDateCreation(commentaire.getDateCreation());
							}


							return existingCommentaire;
						}
				)
				.map(commentaireRepositroy::save);
	}

	@Override
	public Page<Commentaire> findAll(Pageable pageable) {
		return commentaireRepositroy.findAll(pageable);
	}


	@Override
	public boolean delete(Long id) {
		if (id == null) {
			log.error("commentaire id is null");
			return false;
		}
		commentaireRepositroy.deleteById(id);
		return false;
	}

}
