package com.pfa.elearning.service;

import java.util.List;

import com.pfa.elearning.dto.ReclamationDto;

public interface IReclamationService {

	ReclamationDto save(ReclamationDto dto);
	
	ReclamationDto findById(Long id);
	
	List<ReclamationDto> findAll();
	
	void delete(Long id);
	
	
}
