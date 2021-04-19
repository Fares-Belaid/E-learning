package com.pfa.elearning.service;

import java.util.List;

import com.pfa.elearning.dto.ReponseDto;

public interface IReponseService {

	ReponseDto save(ReponseDto dto);
	
	ReponseDto findById(Long id);
	
	List<ReponseDto> findAll();
	
	void delete(Long id);
}
