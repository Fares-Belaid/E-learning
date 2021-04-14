package com.pfa.elearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pfa.elearning.controller.api.AvisApi;
import com.pfa.elearning.dto.AvisDto;
import com.pfa.elearning.service.IAvisService;

@RestController
public class AvisController implements AvisApi {

	@Autowired
	private IAvisService avisService;
	
	@Override
	public AvisDto save(AvisDto dto) {
		return avisService.save(dto);
	}

	@Override
	public AvisDto findById(Long id) {
		return avisService.findById(id);
	}

	@Override
	public List<AvisDto> findAll() {
		return avisService.findAll();
	}

	@Override
	public void delete(Long id) {
		avisService.delete(id);		
	}

}
