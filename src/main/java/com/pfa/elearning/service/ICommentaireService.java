package com.pfa.elearning.service;

import java.util.List;

import com.pfa.elearning.dto.CommentaireDto;

public interface ICommentaireService {


	CommentaireDto save(CommentaireDto dto);
	
	CommentaireDto findById(Long id);
	
	List<CommentaireDto> findAll();
	
	void delete(Long id);
}
