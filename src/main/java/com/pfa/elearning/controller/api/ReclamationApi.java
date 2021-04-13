package com.pfa.elearning.controller.api;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pfa.elearning.utils.Constants;
import com.pfa.elearning.dto.ReclamationDto;


public interface ReclamationApi extends Constants {


	@PostMapping(value = APP_ROOT +"/reclamations/create")
	ReclamationDto save(@RequestBody ReclamationDto dto);

	@GetMapping(value = APP_ROOT +"/reclamations/{idReclamation}")
	ReclamationDto findById(@PathVariable("idReclamation") Long id);

	@GetMapping(value = APP_ROOT +"/reclamations/all")
	List<ReclamationDto> findAll();
	
	@DeleteMapping(value = APP_ROOT +"/reclamations/delete/{id}")
	void delete(Long id);
}
