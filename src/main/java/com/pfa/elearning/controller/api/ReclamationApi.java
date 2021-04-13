package com.pfa.elearning.controller.api;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pfa.elearning.dto.ReclamationDto;
import static com.pfa.elearning.utils.Constants.APP_ROOT;

public interface ReclamationApi {


	@PostMapping(value = APP_ROOT +"/reclamations/create", consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE,produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	ReclamationDto save(@RequestBody ReclamationDto dto);

	@GetMapping(value = APP_ROOT +"/reclamations/{idReclamation}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	ReclamationDto findById(@PathVariable("idReclamation") Long id);

	@GetMapping(value = APP_ROOT +"/reclamations/all", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	List<ReclamationDto> findAll();
	
	@DeleteMapping(value = APP_ROOT +"/reclamations/delete/{id}")
	void delete(Long id);
}
