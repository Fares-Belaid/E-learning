package com.pfa.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.elearning.controller.api.ReclamationApi;
import com.pfa.elearning.dto.ReclamationDto;
import com.pfa.elearning.service.IReclamationService;

@RestController
public class ReclamationController implements ReclamationApi {

	@Autowired
	private IReclamationService reclamationService;

	@Override
	public ReclamationDto save(ReclamationDto dto) {
		return reclamationService.save(dto);
	}

	@Override
	public ReclamationDto findById(Long id) {
		return reclamationService.findById(id);
	}

	@Override
	public List<ReclamationDto> findAll() {
		return reclamationService.findAll();
	}

	@Override
	public void delete(Long id) {
		 reclamationService.delete(id);
	}
	
	
	
}
