package com.pfa.elearning.service;

import java.util.List;

import com.pfa.elearning.dto.AvisDto;

public interface IAvisService {

	AvisDto save(AvisDto dto);
	
	AvisDto findById(Long id);
	
	List<AvisDto> findAll();
	
	void delete(Long id);
}
