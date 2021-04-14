package com.pfa.elearning.service;

import java.util.List;

import com.pfa.elearning.dto.UtilisateurDto;

public interface IUtilisateurService {
	UtilisateurDto save(UtilisateurDto dto);
	
	UtilisateurDto findById(Long id);
	
	List<UtilisateurDto> findAll();
	
	void delete(Long id);
}
