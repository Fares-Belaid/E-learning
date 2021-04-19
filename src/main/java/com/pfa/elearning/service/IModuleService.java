package com.pfa.elearning.service;

import java.util.List;

import com.pfa.elearning.dto.ModuleDto;

public interface IModuleService {

	ModuleDto save(ModuleDto dto);
	
	ModuleDto findById(Long id);
	
	List<ModuleDto> findAll();
	
	void delete(Long id);
}
