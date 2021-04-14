package com.pfa.elearning.controller.api;

import static com.pfa.elearning.utils.Constants.APP_ROOT;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pfa.elearning.dto.AvisDto;

public interface AvisApi {

	@PostMapping(value = APP_ROOT +"/avis/create", consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE,produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	AvisDto save(@RequestBody AvisDto dto);

	@GetMapping(value = APP_ROOT +"/avis/{idAvis}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	AvisDto findById(@PathVariable("idAvis") Long id);

	@GetMapping(value = APP_ROOT +"/reclamations/all", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	List<AvisDto> findAll();
	
	@DeleteMapping(value = APP_ROOT +"/avis/delete/{id}")
	void delete(Long id);
}
