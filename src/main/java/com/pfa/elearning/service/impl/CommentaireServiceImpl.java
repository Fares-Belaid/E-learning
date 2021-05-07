package com.pfa.elearning.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
		return commentaireRepositroy.save(commentaire);
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
	public Page<Commentaire> findAll(Pageable pageable) {
		return commentaireRepositroy.findAll(pageable);
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
