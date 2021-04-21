package com.pfa.elearning.service;

import java.util.List;

import com.pfa.elearning.dto.RessourcesDto;
import com.pfa.elearning.model.Cours;


public interface IRessourceService {

	RessourcesDto save(RessourcesDto dto);
	
	RessourcesDto findById(Long id);
	
	List<RessourcesDto> findAll();
	
	List<RessourcesDto> findByCours(Cours cours);
	
	void delete(Long id);
}
